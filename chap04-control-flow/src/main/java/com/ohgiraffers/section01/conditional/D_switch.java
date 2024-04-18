package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch { // D_switch 시작
    public static void main(String[] args){

        D_switch ddd = new D_switch();
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 성적을 입력하세요 : ");
        int score = sc.nextInt();
        sc.nextLine();
        ddd.score(score);
    }

    //계산기를 만들고 결과를 반환합니다. switch이용해서 반환된 결과를 application02에서 출력
    //등급계산기 프로그램  main에서 학생성적을 입력받고 아래 메서드에서 학생의 등급을 화면에 출력

    public double switchCalculator() { //testSimpleSwitch 메서드 시작

        //사용자에게 값을 입력받는 객체 sc를 생성
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        double first = sc.nextInt();

        System.out.println("두번째 숫자를 입력하세요");
        double second = sc.nextInt();

        System.out.println("연산기호를 입력하세요");
        char cal = sc.next().charAt(0);

        switch (cal) { // cal변수를 기준으로 아래값과 일치하는지 확인
            case '+': // cal이 + 와 같다면 하기 구문을 출력
                System.out.println("x + y = " + (first + second));
                break; // 빠져나간다.

            case '-':// cal이 - 와 같다면 하기 구문을 출력
                System.out.println("x - y = " + (first - second));
                break;// 빠져나간다.

            case '*':// cal이 * 와 같다면 하기 구문을 출력
                System.out.println("x * y = " + (first * second));
                break;// 빠져나간다.

            case '/':// cal이 / 와 같다면 하기 구문을 출력
                System.out.println("x / y = " + (first / second));
                break;// 빠져나간다.

            default:// cal이 상기 case와 일치하는 게 없을때 하기 구문을 출력
                System.out.println("연산불가.");
                return 0.0;
        }
        return 0.0;
    }

        public void score(int score){

        String grade;

        if (score == 100){
            grade = "A+";
            System.out.println("학생의 등급은 " + grade + " 입니다.");
        }
        else if ((score >= 90) && (score < 100)){
            grade = "A";
            System.out.println("학생의 등급은 " + grade + " 입니다.");
        }
        else if ((score >= 85) && (score < 90)){
            grade = "B+";
            System.out.println("학생의 등급은 " + grade + " 입니다.");
        }
        else if ((score >= 75) && (score < 85)){
            grade = "B";
            System.out.println("학생의 등급은 " + grade + " 입니다.");
        }
        else if ((score >= 60) && (score < 75)){
            grade = "C";
            System.out.println("학생의 등급은 " + grade + " 입니다.");
        }
        else if ((score >= 0) && (score < 60)){
            grade = "D";
            System.out.println("학생의 등급은 " + grade + " 입니다.");
        }
        else{
            System.out.println("성적을 다시 입력하세요.");
        }

    }

} // D_switch 종료
