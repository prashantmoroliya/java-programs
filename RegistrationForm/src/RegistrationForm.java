import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

public class RegistrationForm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("uname");
        String pword = request.getParameter("pword");
        String mail = request.getParameter("mail");
        String gender = request.getParameter("gender");
        String dob = request.getParameter("dob");
        String phno = request.getParameter("phno");
        InputStream img = request.getInputStream();

        try {

            // loading drivers for postgresql
            Class.forName("org.postgresql.Driver");

            // creating connection with the database
            Connection con = DriverManager.getConnection
                    ("jdbc:postgresql://localhost/test?user=darthvader&password=Bittuji&ssl=true");

            PreparedStatement ps = con.prepareStatement
                    ("insert into register values(?,?,?,?,?,?,?)");

            ps.setString(1, uname);
            ps.setString(2, pword);
            ps.setString(3, mail);
            ps.setString(4, gender);
            ps.setString(5, dob);
            ps.setString(6, phno);
            if(img != null) {
                ps.setBlob(7, img);
            }

            int i = ps.executeUpdate();

            if(i > 0) {
                out.println("You are successfully registered");
            }

        }
        catch(Exception se) {
            se.printStackTrace();
        }

    }
}
