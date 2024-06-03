package language.java.practice.Practice_005_Array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
         * 문법
         * - 타입[][] 배열이름;
         * - 타입 배열이름[][];
         * - 타입[] 배열이름[];
         */

        int[][] arr = new int[2][3];

        int k = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr1 = {
                { 10, 20, 30 },
                { 40, 50, 60 }
        };

        // 가변 배열 (dynamic array)
        // 행마다 다른 길이의 배열을 요소로 저장할 수 있음
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[4];
        arr2[2] = new int[1];

        int[][] arr3 = {
                { 10, 20 },
                { 10, 20, 30, 40 },
                { 10 }
        };

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
