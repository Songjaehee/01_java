package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args){

        /*
        자료형이란
        다양한 값의 형태별로 어느정도 크기를 하나의 값으로 취급할 것인지 미리 compiler 와 약속한 키워드
        예) 앞으로 사용한 int 자료형은 정수를 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        이러한 자료형은 기본자료형 (primary type)과 참조자료형(Referance type)으로 나뉘어진다.
        그 중 자료형 8가지부터 살펴본다.
         */

        //정수를 취급하는 자료형은 4가지가 있다.
        byte bnum; // 1byte;
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        //실수를 취급하는 자료형은 2가지가 있다.
        float fnum; // 4byte
        double dnum; // 8byte

        // 문자를 취급하는 자료형은 한 가지가 있다.
        char ch; // 2byte

        // 논리형 자료형은 한가지가 있다.
        boolean isTrue; // 1byte

        //문자열을 취급하는 자료형
        String str; // 4byte

        //변수 초기화 하기
        bnum = 123;
        snum = 1234;
        inum = 1234;
        lnum = 1234L;
        fnum = 12.34F;
        dnum = 12.34;
        ch = 1;
        isTrue = true;
        str = "jaehee";


        System.out.println(bnum + ch);
        System.out.println(snum);
        System.out.println(inum);
        System.out.println(lnum);
        System.out.println(fnum);
        System.out.println(dnum);
        System.out.println(isTrue);
        System.out.println(str);



    }
}
