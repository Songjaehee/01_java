package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args){
        /*
        증감 연산자
        피연산자의 앞 또는 뒤에 사용이 가능
        ++ : 1의 증가를 의미
        -- : 1의 감소를 의미
        ++X || X++
         */

        int num = 0;
        int x = 10 + (++num);
        System.out.println(x);
        System.out.println(num);


        num=0;
        x = 10 + (num++);
        System.out.println(x);

        num = 0;
        System.out.println(num++ * 10);//num =0
        int result = num++ * 10; //num=1
        System.out.println(result); //num=2

        result = ++num * 10; //num=3
        System.out.println(result); //num=3


    }
}
