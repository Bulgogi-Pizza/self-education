package language.java.practice.Practice_004_ControlFlowStatement;

public class OtherControlFlowStatements {
    public static void main(String[] args) {
        int num = 1, sum = 0;

        // continue
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }

        // break
        while (true) {
            sum += num;
            if (num == 100) {
                break;
            }
            num++;
        }
        System.out.println(sum);

        // break with label
        allLoop: for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
