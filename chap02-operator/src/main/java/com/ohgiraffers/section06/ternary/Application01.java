package com.ohgiraffers.section06.ternary;

public class Application01 {
    public static void main(String[] args){
        /*
        삼항 연산자
        자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        항목이 3개임 : (조건식)? 참일경우 : 거짓일 경우
        조건식은 반드시 결과가 true || false가 나오도록 해야한다.
         */

        int num1 = 10;
        int num2 = -10;

        // num1과 num2를 삼항 연산자를 이용하여 양수 또는 정수로 표현해주세요
        System.out.println();

        System.out.println("=========== num 1 =============");
        String result1 = (num1 > 0) ? "양수" : "정수";
        System.out.println("num1은 " + result1 + "입니다.");

        System.out.println();


        System.out.println("=========== num 2 =============");
        String result2 = (num2 > 0) ? "양수" : "정수";
        System.out.println("num2은 " + result2 + "입니다.");

        System.out.println();


        // 삼항 연산자 중첩사용
        System.out.println("=========== 삼항연산자 중첩 사용 =============");

        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수입니다." : (num3==0)? "0입니다." : "음수이다.";
        System.out.println("num3은 " + result3);

        String result4 = (num4 > 0)? "양수입니다." : (num4==0)? "0입니다." : "음수이다.";
        System.out.println("num4은 " + result4);

        String result5 = (num5 > 0)? "양수입니다." : (num5==0)? "0입니다." : "음수이다.";
        System.out.println("num5은 " + result5);
    }
}



