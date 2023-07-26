package z036_multiple_constructors;

public class tuna_incomplete {
    private int hour;
    private int minute;
    private int second;

    public tuna_incomplete() {
        this(0, 0 , 0);
    }

    public tuna_incomplete(int h) {
        this(h, 0 , 0);
    }

    public tuna_incomplete(int h, int m) {
        this(h, m , 0);
    }

    public tuna_incomplete(int h, int m, int s) {
        setTime(h, m , s);
    }

    public void setTime(int h, int m, int s) {
//        setHour(h);
//        setMinute(m);
//        setSecond(s);
    }
}
