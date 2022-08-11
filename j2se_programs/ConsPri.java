public class ConsPri {
    int i;
    private ConsPri() {
        i = 20;
        System.out.println("the cons is called");
    }

    public static void main(String[] args) {
        ConsPri cp = new ConsPri();
        System.out.println("value of i is = "+cp.i);
    }
}
