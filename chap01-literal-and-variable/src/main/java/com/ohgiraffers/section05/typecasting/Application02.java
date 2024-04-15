package com.ohgiraffers.section05.typecasting;

public class Application02 {
    public static void main(String[] args){


         /*
         강제형변환
         바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
          */

        /*
        자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        1. 강제 형변환 규칙
            1.1 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
            1.2 실수를 정수로 변경시 강제 형변환이 필요하다
            1.3 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
            1.4 논리형은 강제 형변환 규칙에서 제외된다.
         */

        byte num = 1;
        char CharAt = 'A'; // 문자는 정수료 변환이 가능하다.
        //자바에서 정수를 취급하는 기본단위는 int
        //문자는 == 정수 == int

        long lnum = 9L;
        int inum = (int)lnum;
        System.out.println(inum);

        short snum = (short)inum;
        byte bnum = (byte)snum;

        //자동형변환이 발생된다.
        snum = bnum;


        //------------------
        //실수를 정수로 변경 시 강제 형변환이 필요하다.
        double dnum = 8.8;
        float fnum = (float)dnum;

        char ch = 'a';  //문자로 표현하면 char 1 byte 이지만 숫자 int 로 받게되면 4 byte
        byte bnum2 = (byte) ch;
        int result = ch;
        System.out.println(bnum2);
        System.out.println(result);


    }
}
