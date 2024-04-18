package com.ohgiraffers.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /*
        for문 표현식
        for(초기식; 조건식; 증감식){
            조건식이 참인 경우 실행할 구문 == 반복할 구문
        }
         */
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println("천원 갯수 : " + j);
            }
            System.out.println("천원이 10장 모인 갯수 : " + i);
        }

    }

    public void gugudan(){
        for(int i = 1; i <= 9 ;i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }

    public void second() {
        for (int i = 2; i == 2; i++) {
            System.out.println();
            System.out.println("2의 배수 출력하기");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i * j);
            }
        }
    }
    public void gugudanTwo()
    {   int i = 2;
        for (int j = i; j <= 9; j++)
        {    // 7 % 2 == 0
            if(j % i == 0 ) //
                for (int y = 1; y <= 9; y++)
                {
                    System.out.println(j + " * " + y + " = " + j * y);
            }
        }
    }
    public void inputinfomation() {

        for (int i = 1; i <= 10; i++){
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int age = sc.nextInt();
            System.out.println("name : " + name);
            System.out.println("age : " + age);
        }
    }
}




