package z045_final;

public class fish {
    private int sum;
    private final int NUMBER;

    public fish(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public String toString() {
        return String.format("sum = %d\n", sum);
    }
}
