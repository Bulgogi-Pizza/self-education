package language.java.practice.Practice_004_ControlFlowStatement;

/**
 * In orfer for a Java program to achieve the desired result,
 * you may have to control the sequential flow of the program.
 * 
 * The command statement used at this time is called a control statement,
 * and these control statements inclide conditional statements, loops, etc.
 * 
 * The imperative belonging to these control statements are surrounded
 * by curly braces ({}), and these curly brace regions are called blocks.
 */
public class ConditionalStatements {
    public static void main(String[] args) {
        char ch = 'a';

        // if / else if / else
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다.");
        }

        // ternary operator
        System.out.println((ch >= 'a' && ch <= 'z') ? "소문자" : "소문자 아님");

        // switch
        switch (ch) {
            case 'a':
                System.out.println("해당 문자는 'a'입니다.");
                break;
            case 'e':
                System.out.println("해당 문자는 'e'입니다.");
                break;
            default:
                System.out.println("해당 문자는 a나 e가 아닙니다.");
                break;
        }

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("해당 문자는 '소문자 모음'입니다.");
                break;
            default:
                System.out.println("해당 문자는 소문자 모음이 아닙니다.");
                break;
        }
    }
}
