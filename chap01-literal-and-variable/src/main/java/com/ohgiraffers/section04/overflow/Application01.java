package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args){
        // 자료형 별 값의 최대범위를 벗어나는 경우 발생한 carry를 버림처리하고 sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " + num1);
        num1 ++;


        System.out.println("byte num : " + num1);

        int firstNum = 10000000;
        int secondNum = 7000000;
        System.out.println("first num * secondNum = " + (firstNum * secondNum));

        long longmulti = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + longmulti);

        long lnum = ((long)firstNum * secondNum);
        System.out.println("firstNum * secondNum = " + lnum);

    }
}
