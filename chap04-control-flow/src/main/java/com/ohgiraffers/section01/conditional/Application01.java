package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        int sum;
        int minus;
        int multy;
        int divide;
        Application01 app1 = new Application01();
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("두번째 숫자를 입력하세요");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("연산기호를 입력하세요");
        char cal = sc.next().charAt(0);


            if (cal == '+') {
                sum = x + y;
                System.out.println("x + y = " + sum);
            } else if (cal == '-') {
                minus = x - y;
                System.out.println("x - y = " + minus);
            } else if (cal == '*') {
                multy = x * y;
                System.out.println("x * y = " + multy);

            } else if (cal == '/') {
                divide = x / y;
                System.out.println("x / y = " + divide);
            } else {
                System.out.println("다른 수식을 입력하세요");
            }
        }
    }


