/*
 * only alphabet, numbers, under_score, dollar($)
 * variable name can't start with num
 * variable name can't include space
 * variable name can't use Keyword
 * 
 * type of variable
 *     1. 기본형(primitive type) 변수
 *     2. 참조형(reference type) 변수
 * 
 * primitive type : used in the actual operation
 * 
 * 정수형 : byte, short, int, long
 * 실수형 : float, double
 * 문자형 : char
 * 논리형 : boolean
 * 
 * reference type : created and used by the user himself using 8 primitive variables
 * 
 * to use variable
 *     1. declare
 *     2. initialize
 *     3. call
 */

package language.java.practice.Practice_002_Type;

public class Variable {
    public static void main(String[] args) {

        int num; // declare
        // System.out.println(num); // error accured
        num = 20; // initialize
        System.out.println(num);

        int num1 = 10, num2 = 30;
        double num3 = 3.14;
        double num4 = 1.23, num5 = 4.56;
        System.out.printf("%d, %d, %d, %.2f, %.2f, %.2f", num, num1, num2, num3, num4, num5);

    }
}
