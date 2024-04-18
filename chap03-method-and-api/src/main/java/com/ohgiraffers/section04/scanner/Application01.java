package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {


        Application01 app1 = new Application01();
        System.out.println(app1.inputInfo());

    }


    public String inputInfo(){

        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 키는 몇인가요 ?");
        double height = sc.nextDouble();


        System.out.println("당신의 나이는 몇살인가요 ?");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("당신의 성별은 무엇인가요 ?");
        char gender = sc.nextLine().charAt(0);


        System.out.println("당신의 이름은 무엇인가요 ?");
        String name = sc.nextLine();




        return " 당신의 키는 " + height + " 입니다. \n 당신의 나이는 " + age + "세 입니다.\n 당신의 성별은 " + gender + "자 입니다." +
                "\n 당신의 이름은 " + name + "입니다.";


        }

    }

