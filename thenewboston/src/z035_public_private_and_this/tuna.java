package z035_public_private_and_this;

public class tuna {
    private int hour = 1;
    private int minute = 2;
    private int second = 3;

    public void setTime(int hour, int minute, int second) {
        this.hour = 4;
        this.minute = 5;
        this.second = 6;

        //this is a reference of the variable
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour==0 || hour==12) ? 12 : hour%12), minute, second,
                (hour < 12 ? "AM" : "PM"));
    }
}
