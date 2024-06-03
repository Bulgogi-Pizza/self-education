package language.java.practice.Practice_005_Array;

import java.util.Arrays;

/**
 * In Java, an array cannot change its length once it is created.
 * 
 * Therefore, in order to store more data, you need to create a larger array,
 * and copy the data from the previous array into a newly created array.
 * 
 * For copying these arrays, Java offers several methods, such as:
 * 
 * 1. The arraycopy() method of the System class
 * 2. The copyOf() method of the Arrays class
 * 3. The clone() method of the Object class
 * 4. Copying using for statements and indexes
 * 
 * Of these, the best performance is the arraycopy() method,
 * which is created solely for copying arrays.
 * 
 * However, the most commonly used method for copying current arrays is
 * the more flexible copyOf()method.
 * 
 * Copying using the arraycopy(), copyOf() methods, and the for statement
 * can increase the length of the array at will.
 * 
 * However, the clone() method can only create arrays of the same
 * length as the previous array.
 */

public class UtilizationOfArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int newLen = 10;

        // 1. The arraycopy() method of the System class
        int[] arr2 = new int[newLen];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // 2. The copyOf() method of the Arrays class
        int[] arr3 = Arrays.copyOf(arr1, 10);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        // 3. The clone() method of the Object class
        int[] arr4 = (int[]) arr1.clone();

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        // 4. For copying with statements and indexes
        int[] arr5 = new int[newLen];

        for (int i = 0; i < arr1.length; i++) {
            arr5[i] = arr1[i];
        }
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }
        System.out.println();

        // Enhanced for statement
        /*
         * 문법
         * for (타입 변수이름 : 배열이나컬렉션이름) {
         * 실행문;
         * }
         */

        for (int e : arr5) {
            System.out.println(e);
        }
    }
}
