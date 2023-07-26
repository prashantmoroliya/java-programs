import java.io.*;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Notepad implements ActionListener, MenuConstants {
    JFrame f;
    JTextArea ta;
    JLabel statusBar;

    private String fileName = "Untitled";
    private boolean saved = true;
    String applicationName = "Notepad by Darth Vader";
    String searchString, replaceString;
    int lastSearchIndex;
    FileOperation fileHandler;
    FontChooser fontDialog = null;
    FindDialog findReplaceDialog = null;
    JColorChooser bcolorChooser = null;
    JColorChooser fcolorChooser = null;
    JDialog backgroundDialog = null;
    JDialog foregroundDialog = null;
    JMenuItem cutItem, copyItem, deleteItem, findItem, findNextItem, replaceItem, gotoItem, selectAllItem;

    Notepad() {
        f = new JFrame(fileName+" - "+applicationName);
        ta = new JTextArea(30, 60);
        statusBar = new JLabel("||       Ln 1, Col 1  ",JLabel.RIGHT);
        f.add(new JScrollPane(ta), BorderLayout.CENTER);
        f.add(statusBar, BorderLayout.SOUTH);
        f.add(new JLabel(" "), BorderLayout.EAST);
        f.add(new JLabel(" "), BorderLayout.WEST);
        createMenuBar(f);
        // f.setSize(350, 350);
        f.pack();
        f.setLocation(100, 50);
        f.setVisible(true);
        f.setLocation(150, 50);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fileHandler = new FileOperation(this);

        //-------------------------
        ta.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int lineNumber = 0, column = 0, pos = 0;
                try {
                    pos = ta.getCaretPosition();
                    lineNumber = ta.getLineOfOffset(pos);
                    column = pos-ta.getLineStartOffset(lineNumber);
                } catch(Exception excp) {

                }
                if(ta.getText().length() == 0) {
                    lineNumber = 0;
                    column = 0;
                }
                statusBar.setText("||       Ln "+(lineNumber+1)+", Col "+(column+1));
            }
        });
        // -------------------------------

        // -------------------------------
        DocumentListener myListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                fileHandler.saved = false;
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                fileHandler.saved = false;
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                fileHandler.saved = false;
            }
        };
        ta.getDocument().addDocumentListener(myListener);
        // ------------------------------------

        // ------------------------------------
        WindowListener frameClose = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if(fileHandler.confirmSave()) {
                    System.exit(0);
                }
            }
        };
        f.addWindowListener(frameClose);
        // -------------------------------------

        // ------------------------------------
        /*
        ta.append("Hello dear hello hi");
        ta.append("\nwho are u dear mister hello");
        ta.append("\nhello bye hel");
        ta.append("\nHello");
        ta.append("\nMiss u mister hello hell");
        fileHandler.saved=true;
         */
        // ---------------------------------------
    }

    void goTo() {
        int lineNumber = 0;
        try {
            lineNumber = ta.getLineOfOffset(ta.getCaretPosition())+1;
            String tempStr = JOptionPane.showInputDialog(f,"Enter Line Number:",""+lineNumber);
            if(tempStr == null) {
                return;
            }
            lineNumber = Integer.parseInt(tempStr);
            ta.setCaretPosition(ta.getLineStartOffset(lineNumber-1));
        } catch (Exception e) {

        }
    }

    public void actionPerformed(ActionEvent ev) {
        String cmdText = ev.getActionCommand();

        if(cmdText.equals(fileNew)) {
            fileHandler.newFile();
        } else if(cmdText.equals(fileOpen)) {
            fileHandler.openFile();
        } else if(cmdText.equals(fileSave)) {
            fileHandler.saveThisFile();
        } else if(cmdText.equals(FileSaveAs)) {
            fileHandler.saveAsFile();
        } else if(cmdText.equals(fileExit)) {
            if (fileHandler.confirmSave()) {
                System.exit(0);
            }
        } else if(cmdText.equals(filePrint)) {
            JOptionPane.showMessageDialog(Notepad.this.f,
                    "Get your printer repaired first! It seems you don't have one!", "Bad Printer",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if(cmdText.equals(editCut)) {
            ta.cut();
        } else if (cmdText.equals(editCopy)) {
            ta.copy();
        } else if(cmdText.equals(editPaste)) {
            ta.paste();
        } else if(cmdText.equals(editDelete)) {
            ta.replaceSelection("");
        } else if(cmdText.equals(editFind)) {
            if(Notepad.this.ta.getText().length() == 0) {
                return;     // text box have no text
            }
            if(findReplaceDialog == null) {
                findReplaceDialog = new FindDialog(Notepad.this.ta);
            }
            findReplaceDialog.showDialog(Notepad.this.f, true);
        } else if(cmdText.equals(editFindNext)) {
            if(Notepad.this.ta.getText().length() == 0) {
                return;     // text box have no text
            }
            if(findReplaceDialog == null) {
                statusBar.setText("Use Find option of Edit Menu first !!!!");
            } else {
                findReplaceDialog.findNextWithSelection();
            }
        } else if(cmdText.equals(editReplace)) {
            if(Notepad.this.ta.getText().length() == 0) {
                return;     // text box have no text
            }
            if(findReplaceDialog == null) {
                findReplaceDialog = new FindDialog(Notepad.this.ta);
            }
            findReplaceDialog.showDialog(Notepad.this.f, false);
        } else if(cmdText.equals(editGoTo)) {
            if(Notepad.this.ta.getText().length() == 0) {
                return;     // text box have no text
            }
            goTo();
        } else if(cmdText.equals(editSelectAll)) {
            ta.selectAll();
        } else if(cmdText.equals(editTimeDate)) {
            ta.insert(new Date().toString(), ta.getSelectionStart());
        } else if(cmdText.equals(formatWordWrap)) {
            JCheckBoxMenuItem temp = (JCheckBoxMenuItem) ev.getSource();
            ta.setLineWrap(temp.isSelected());
        } else if(cmdText.equals(formatFont)) {
            if(fontDialog == null) {
                fontDialog = new FontChooser(ta.getFont());
            }
            if(fontDialog.showDialog(Notepad.this.f, "Choose a font")) {
                Notepad.this.ta.setFont(fontDialog.createFont());
            }
        } else if(cmdText.equals(formatForeground)) {
            showForegroundColorDialog();
        } else if(cmdText.equals(formatBackground)) {
            showBackgroundColorDialog();
        } else if(cmdText.equals(viewStatusBar)) {
            JCheckBoxMenuItem temp = (JCheckBoxMenuItem) ev.getSource();
            statusBar.setVisible(temp.isSelected());
        } else if(cmdText.equals(helpAboutNotepad)) {
            JOptionPane.showMessageDialog(Notepad.this.f, aboutText, "Notepad<br>Made by Darth Vader",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            statusBar.setText("This "+cmdText+" command is yet to be implemented");
        }
    }       // action performed

    void showBackgroundColorDialog() {
        if(bcolorChooser == null) {
            bcolorChooser = new JColorChooser();
        }
        if(backgroundDialog == null) {
            backgroundDialog = JColorChooser.createDialog
                    (Notepad.this.f,
                            formatBackground,
                            false,
                            bcolorChooser,
                            new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    Notepad.this.ta.setBackground(bcolorChooser.getColor());
                                }
                            }, null);
        }
        backgroundDialog.setVisible(true);
    }

    void showForegroundColorDialog() {
        if(fcolorChooser == null) {
            fcolorChooser = new JColorChooser();
        }
        if(foregroundDialog == null) {
            foregroundDialog = JColorChooser.createDialog
                    (Notepad.this.f,
                            formatBackground,
                            false,
                            fcolorChooser,
                            new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    Notepad.this.ta.setForeground(fcolorChooser.getColor());
                                }
                            }, null);
        }
        foregroundDialog.setVisible(true);
    }

    JMenuItem createMenuItem(String s, int key, JMenu toMenu, ActionListener al) {
        JMenuItem temp = new JMenuItem(s, key);
        temp.addActionListener(al);
        toMenu.add(temp);

        return temp;
    }

    JMenuItem createMenuItem(String s, int key, JMenu toMenu, int aclKey, ActionListener al) {
        JMenuItem temp = new JMenuItem(s, key);
        temp.addActionListener(al);
        temp.setAccelerator(KeyStroke.getKeyStroke(aclKey, ActionEvent.CTRL_MASK));
        toMenu.add(temp);

        return temp;
    }

    JCheckBoxMenuItem createCheckBoxMenuItem(String s, int key, JMenu toMenu, ActionListener al) {
        JCheckBoxMenuItem temp = new JCheckBoxMenuItem(s);
        temp.setMnemonic(key);
        temp.addActionListener(al);
        temp.setSelected(false);
        toMenu.add(temp);

        return temp;
    }

    JMenu createMenu(String s, int key, JMenuBar toMenuBar) {
        JMenu temp = new JMenu(s);
        temp.setMnemonic(key);
        toMenuBar.add(temp);

        return temp;
    }

    void createMenuBar(JFrame f) {
        JMenuBar mb = new JMenuBar();
        JMenuItem temp;

        JMenu fileMenu = createMenu(fileText, KeyEvent.VK_F, mb);
        JMenu editMenu = createMenu(editText, KeyEvent.VK_E, mb);
        JMenu formatMenu = createMenu(formatText, KeyEvent.VK_O, mb);
        JMenu viewMenu = createMenu(viewText, KeyEvent.VK_V, mb);
        JMenu helpMenu = createMenu(helpText, KeyEvent.VK_H, mb);

        createMenuItem(fileNew, KeyEvent.VK_N, fileMenu, KeyEvent.VK_N, this);
        createMenuItem(fileOpen, KeyEvent.VK_O, fileMenu, KeyEvent.VK_O, this);
        createMenuItem(fileNew, KeyEvent.VK_S, fileMenu, KeyEvent.VK_S, this);
        createMenuItem(fileNew, KeyEvent.VK_A, fileMenu, KeyEvent.VK_A, this);
        fileMenu.addSeparator();
        temp = createMenuItem(filePageSetup, KeyEvent.VK_U, fileMenu, this);
        temp.setEnabled(false);
        createMenuItem(filePrint, KeyEvent.VK_P, fileMenu, KeyEvent.VK_P, this);
        fileMenu.addSeparator();
        createMenuItem(fileExit, KeyEvent.VK_X, fileMenu, this);

        temp = createMenuItem(editUndo, KeyEvent.VK_U, editMenu, KeyEvent.VK_Z, this);
        temp.setEnabled(false);
        editMenu.addSeparator();
        cutItem = createMenuItem(editCut, KeyEvent.VK_T, editMenu, KeyEvent.VK_X, this);
        copyItem = createMenuItem(editCopy, KeyEvent.VK_C, editMenu, KeyEvent.VK_C, this);
        createMenuItem(editPaste, KeyEvent.VK_P, editMenu, KeyEvent.VK_V, this);
        deleteItem = createMenuItem(editDelete, KeyEvent.VK_L, editMenu, this);
        deleteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        editMenu.addSeparator();
        findItem = createMenuItem(editFind, KeyEvent.VK_F, editMenu, KeyEvent.VK_F, this);
        findNextItem = createMenuItem(editFindNext, KeyEvent.VK_N, editMenu, this);
        findNextItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
        replaceItem = createMenuItem(editReplace, KeyEvent.VK_R, editMenu, KeyEvent.VK_H, this);
        gotoItem = createMenuItem(editGoTo, KeyEvent.VK_G, editMenu, KeyEvent.VK_G, this);
        editMenu.addSeparator();
        selectAllItem = createMenuItem(editSelectAll, KeyEvent.VK_G, editMenu, KeyEvent.VK_A, this);
        createMenuItem(editTimeDate, KeyEvent.VK_D, editMenu, this)
                .setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));

        createCheckBoxMenuItem(formatWordWrap, KeyEvent.VK_W, formatMenu, this);

        createMenuItem(formatFont, KeyEvent.VK_F, formatMenu, this);
        formatMenu.addSeparator();
        createMenuItem(formatForeground, KeyEvent.VK_T, formatMenu, this);
        createMenuItem(formatBackground, KeyEvent.VK_P, formatMenu, this);

        createCheckBoxMenuItem(viewStatusBar, KeyEvent.VK_S, viewMenu, this.f);

        // For Look and Feel
        LookAndFeelMenu.createLookAndFeelMenuItem(viewMenu, this.f);

        temp = createMenuItem(helpHelpTopic, KeyEvent.VK_H, helpMenu, this);
        temp.setEnabled(false);
        helpMenu.addSeparator();
        createMenuItem(helpAboutNotepad, KeyEvent.VK_A, helpMenu, this);

        MenuListener editMenuListener = new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                if(Notepad.this.ta.getText().length() == 0) {
                    findItem.setEnabled(false);
                    findNextItem.setEnabled(false);
                    replaceItem.setEnabled(false);
                    selectAllItem.setEnabled(false);
                    gotoItem.setEnabled(false);
                } else {
                    findItem.setEnabled(true);
                    findNextItem.setEnabled(true);
                    replaceItem.setEnabled(true);
                    selectAllItem.setEnabled(true);
                    gotoItem.setEnabled(true);
                }

                if(Notepad.this.ta.getSelectionStart() == ta.getSelectionEnd()) {
                    cutItem.setEnabled(false);
                    copyItem.setEnabled(false);
                    deleteItem.setEnabled(false);
                } else {
                    cutItem.setEnabled(true);
                    copyItem.setEnabled(true);
                    deleteItem.setEnabled(true);
                }
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        };
        editMenu.addMenuListener(editMenuListener);
        f.setJMenuBar(mb);
    }
}

