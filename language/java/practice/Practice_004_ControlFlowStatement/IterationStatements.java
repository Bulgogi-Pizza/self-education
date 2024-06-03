package language.java.practice.Practice_004_ControlFlowStatement;

/**
 * A loop is a astatement that controls the execition of the same command
 * within a program for a certain number of times.
 * 
 * Most of the code handled by the program is in many interative forms,
 * so it is one of the most used control statements.
 * 
 * The typical forms of loops used in Java are as follows:
 * 
 * 1. while
 * 2. do / while
 * 3. for
 * 4. Enhanced for
 */

public class IterationStatements {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        // while
        while (i < 5) {
            System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중");
            i++;
        }
        System.out.println("while 종료 후 변수 i의 값 : " + i);

        // do / while
        do {
            System.err.println("while 문이 " + (j + 1) + "번째 반복 실행중");
            j++;
        } while (j < 0);

        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");

        // for
        for (i = 0; i < 5; i++) {
            System.out.println("for 문이 " + (i + 1) + "번째 반복 실행중");
        }
        System.out.println("for 문이 종료된 후 변수 i의 값 : " + i);

        // Enhanced for
        for (int e : arr) {
            System.out.print(e + " ");
        }

    }
}
