package language.java.practice.Practice_005_Array;

/**
 * An array can be defined as a finit set of variables of the same type.
 * 
 * Each value that makes up array is called an element,and a number
 * that points to its position in the array us called an index.
 * 
 * In Java, the index always starts at 0, and can only have positive integers,
 * including 0.
 * 
 * An array is the most basic data structure you can use if you need to
 * deal with a lot of the same kind of data.
 * 
 * Arrays can be declared as one-dimensional arrays, two-dimensional arrays,
 * as well as multi-dimensional arrays, depending on the form in which ther are
 * declared.
 * 
 * Bute even a two-dimensional array, which is realistically
 * easy to understand, is used a lot.
 */

public class OneDimensionalArray {
    public static void main(String[] args) {
        // 문법
        // 타입[] 배열이름;
        // 타입 배열이름[];

        // C랑 다르게 길이보다 적은 수의 배열 요소를 초기화할 경우, 배열의 타입에 맞게 자동으로 초기화됨
        /*
         * char = '\u0000'
         * byte, short, int = 0
         * long = 0L
         * float = 0.0F
         * double = 0.0 또는 0.0D
         * boolean = false
         * 배열, 인스턴스 등 = null
         */

        int[] grade1 = new int[3];
        int[] grade2 = new int[3];

        grade1[0] = 85;
        grade1[1] = 65;
        grade1[2] = 90;

        grade2[0] = 85;

        for (int i = 0; i < grade1.length; i++) {
            System.out.print(grade1[i] + " ");
        }

        for (int i = 0; i < grade2.length; i++) {
            System.out.print(grade2[i] + " ");
        }

        int[] grade3 = { 70, 90, 80 }; // 배열의 선언과 동시에 초기화할 수 있음.
        int[] grade4 = new int[] { 70, 90, 80 }; // 배열의 선언과 동시에 초기화할 수 있음.

        int[] grade5;
        // grade5={70,90,80}; // 이미 선언된 배열을 이 방법으로 초기화하면 오류가 발생함.
        int[] grade6;
        grade6 = new int[] { 70, 90, 80 }; // 이미 선언된 배열은 이 방법으로만 초기화할 수 있음.

        int[] grade7 = new int[] { 85, 99, 23 };

        for (int i = 0; i < grade7.length; i++) {
            System.err.print(grade7[i] + " ");
        }
    }
}
