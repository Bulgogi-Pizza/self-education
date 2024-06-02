/*
 * byte : 1byte
 * short : 2byte
 * int : 4byte
 * long : 8byte
 * 
 * float : 4byte ()
 * double : 8byte
 */

package language.java.practice.Practice_002_Type;

public class PrimitiveType {
    public static void main(String[] args) {
        byte num1 = 127;
        byte num2 = -128;
        double num = 0.1;
        float num3 = 1.23456789f;
        double num4 = 1.23456789;

        num1++;
        num2--;

        System.out.println(num1); // show overflow (-128)
        System.out.println(num2); // show underflow(127)

        for (int i = 0; i < 1000; i++) {
            num += 0.1;
        }
        System.out.println(num);

        System.out.println("float형 변수 num3 : " + num3);
        System.out.println("double형 변수 num4 : " + num4);

    }
}
