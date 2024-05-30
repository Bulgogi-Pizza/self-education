package language.java.practice.Practice_005_TypeConversion;

public class TypeConversion {
    public static void main(String[] args) {
        // implicit conversion
        double num1 = 10;
        // int num2 = 3.14; //in can't converse
        double num3 = 7.0f + 3.14;

        System.out.println(num1); // 10.0
        System.out.println(num3); // 10.14

        // byte -> short -> int -> long -> float -> double
        // char -> int -> long -> float -> double

        byte num4 = 100; // OK
        // byte num5 = 200; // Type mismatch
        // int num6 = 9876543210; // Out of range
        // long num7 = 9876543210; // Out of range
        // float num8 = 3.14; // Type mismatch

        // int num9 = 9876543210L; // Type mismatch
        long num10 = 9876543210L; // OK

        // explicit conversion
        int num11 = 1, num12 = 4;

        double result1 = num11 / num12; // 1/4 -> 0 -> 0.0
        double result2 = (double) num11 / num12; // 1.0/4.0 -> 0.25 -> 0.25

        System.out.println(result1); // 0.0
        System.out.println(result2); // 0.25
    }
}
