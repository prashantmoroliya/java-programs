package z045_final;

public class Final {
    public static void main(String[] args) {
        fish fishObject = new fish(10);

        for (int i=0; i<5; i++) {
            fishObject.add();
            System.out.printf("%s", fishObject);
        }
    }
}
