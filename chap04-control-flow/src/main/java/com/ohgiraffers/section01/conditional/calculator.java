package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        calculator call = new calculator();
        // call.calll();
        call.callll();

    }

    public String calll() {
        int sum;
        int minus;
        int multy;
        int divide;

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        int x = sc.nextInt();

        System.out.println("두번째 숫자를 입력하세요");
        int y = sc.nextInt();

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

        return "";

    }

    public String callll() {
        Scanner scc = new Scanner(System.in);
        String input = scc.nextLine();
        String[] target = input.split(" ");


        int result = 0;

        if (target[1].equals("+")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            System.out.println("= " + result);
        }
        else if (target[1].equals("-")) {
            result = Integer.parseInt(target[0]) - Integer.parseInt(target[2]);
            System.out.println("= " + result);
        }
        else if (target[1].equals("*")){
            result = Integer.parseInt(target[0]) * Integer.parseInt(target[2]);
            System.out.println("= " + result);
        }
        else {
            result = Integer.parseInt(target[0]) / Integer.parseInt(target[2]);
            System.out.println("= " + result);
        }
        return "" + result;

    }
}