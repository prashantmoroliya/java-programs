package z033_time_class;

public class TimeClass {
    public static void main(String[] args) {
        tuna tunaObject = new tuna();
        System.out.println(tunaObject.toMilitary());
        tunaObject.setTime(13, 27, 6);
        System.out.println(tunaObject.toMilitary());
    }
}
