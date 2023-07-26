package z032_variable_length_arguments;

public class VariableLengthArguments {
    public static void main(String[] args) {
        System.out.println(average(43, 56, 76, 8, 65, 76, 2, 31));
    }

    // ... mean we don't know how many arguments I am going to give, ... means just do it forget number of arguments
    public static int average(int...numbers) {
        int total = 0;
        for (int x: numbers) {
            total += x;
        }

        return total/numbers.length;
    }
}
