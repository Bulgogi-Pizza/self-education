package language.java.practice.Practice_003_Operator;

/**
 * made for instanceof practice
 */
class A {
}

/**
 * made for instanceof practice
 */
class B extends A {
}

/**
 * Java has 8 represent operators
 * 1. 산술 연산자(arithmetic operator)
 * 2. 대입 연산자(assignment operator)
 * 3. 증감 연산자(increment and decrement oerators)
 * 4. 비교 연산자(comparison operator)
 * 5. 논리 연산자(logical operator)
 * 6. 비트 연산자(bitwise operator)
 * 7. 삼항 연산자(ternary operator)
 * 8. instanceof 연산자
 * 
 * In these source code and class will practice that operators
 */
public class Operator {

    public static void main(String[] args) {
        // 산술 연산자(arithmetoc operator)
        // + - * / %
        int num1 = 8, num2 = 4;

        System.out.println("+ operator : " + (num1 + num2));
        System.out.println("- operator : " + (num1 - num2));
        System.out.println("* operator : " + (num1 * num2));
        System.out.println("/ operator : " + (num1 / num2));
        System.out.println("% operator : " + (num1 % num2));

        // 대입 연산자(assignment operator)
        // = += -= *= /= %=
        // &= |= ^=
        // <<= >>= >>>=(부호에 상관없이 오른쪽 시프트)
        int num3 = 7, num4 = 7, num5 = 7;

        num3 = num3 - 3;
        num4 -= 3;
        num5 = -3;

        System.out.println("- operator : " + num3);
        System.out.println("-= operator : " + num4);
        System.out.println("= - operator (warning!) : " + num5);

        // 증감 연산자(increment and decrement operators)
        // ++x x++ --x x--
        int num6 = 7, num7 = 7;
        int result1, result2;

        result1 = --num6 + 4;
        result2 = num7-- + 4;

        System.out.println("전위 감소 : " + result1 + ", 변수의 값: " + num6);
        System.out.println("후위 감소 : " + result2 + ", 변수의 값: " + num7);

        int num8 = 10;
        int num9 = num8-- + 5 + --num8; // 23

        System.out.println("num8 : " + num8 + ",num9 : " + num9);

        // 비교 연산자(relational operator)
        // == != > >= < <=
        char ch1 = 'a', ch2 = 'A';

        System.out.println("== operator : " + (ch1 == ch2));
        System.out.println(" > 연산자에 의한 결과 : " + (ch1 > ch2));

        // 논리 연산자(logical operator)
        // && || !
        char ch3 = 'b', ch4 = 'B';
        boolean result3, result4;

        result3 = (ch3 > 'a') && (ch3 < 'z');
        result4 = (ch3 < 'A') || (ch4 < 'Z');

        System.out.println("&& operator : " + result3);
        System.out.println("|| operator : " + result4);
        System.out.println("! operator : " + !result4);

        // 비트 연산자(bitwise operator)
        // & | ^ ~ << >> >>>
        int num10 = 8, num11 = -8;

        System.out.println("~ operator : " + ~num10);
        System.out.println("<< operator : " + (num10 << 2));
        System.out.println(">> operator : " + (num11 >> 2));
        System.out.println(">>> operator : " + (num10 >>> 2));
        System.out.println(">>> operator : " + (num11 >>> 2));

        // 삼항 연산자(ternary operator)
        // 조건식 ? 반환값1 : 반환값2
        int num12 = 5, num13 = 7;
        int result;

        result = (num1 - num2 > 0) ? num1 : num2;
        System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");

        // instanceof 연산자
        // 참조 변수가 참조하고 있는 인스턴스의 실제 타입 반환
        // 즉, 해당 객체가 어떤 클래스나 인터페이스로부터 생성되었는지 판별
        // 인스턴스이름 instanceof 클래스or인터페이스이름

        A a = new A();
        B b = new B();
        System.out.println(a instanceof A); // true
        System.out.println(b instanceof A); // true
        System.out.println(a instanceof B); // false
        System.out.println(b instanceof B); // true
    }
}
