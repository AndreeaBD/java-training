package code._4_student_effort;

public class FooBarQix {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + " -> " + compute(i));
        }
    }

    public static String compute(int x) {
        String s = "";
        boolean changed = false;

        if (x % 3 == 0) {
            s += "Foo";
            changed = true;
        }

        if (x % 5 == 0) {
            s += "Bar";
            changed = true;
        }

        if (x % 7 == 0) {
            s += "Qix";
            changed = true;
        }

        char[] numbers = String.valueOf(x).toCharArray();
        for (char c : numbers) {
            switch (c) {
                case '3' -> s += "Foo";
                case '5' -> s += "Bar";
                case '7' -> s += "Qix";
                case '0' -> s += '*';
            }
        }

        if (!changed) {
            s = String.valueOf(x);
        }

        return s;
    }
}
