package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        /*
        [if 표현식]
        if(조건식){
            조건식이 참일 경우에 실행할 명령문
            }
        조건식 : true or false가 나오는 연산식을 의미한다.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("값을 입력하세요");
        int num = sc.nextInt();
    sc.nextLine();

        if(num == 0){
            System.out.println(num + "은 0입니다.");
        }
        else if(num % 2 == 0){
            System.out.println(num + "은 2의 배수입니다.");
        }
        else{
            System.out.println(num + "은 2의 배수가 아닙니다.");
        }
    }
}
