package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        app3.plus(x, y);
        int result1 = app3.plus(x, y);
        int result2 = app3.minus(x, y);
        int result3 = app3.Multiplication(x, y);
        int result4 = app3.division(x, y);
        int result5 = app3.divisin(x, y);
        System.out.println();
        System.out.println("====더하기====");
        System.out.println(" x + y = " + result1);
        System.out.println();
        System.out.println("====빼기=====");
        System.out.println(" x - y = " + result2);
        System.out.println();
        System.out.println("====곱하기=====");
        System.out.println(" x * y = " + result3);
        System.out.println();
        System.out.println("====나누기=====");
        System.out.println(" x / y = " + result4);
        System.out.println();
        System.out.println("====나머지=====");
        System.out.println(" x % y = " + result5);


    }
    //더하기 함수
    //접근제어자(public) 반환타입(int) 함수명(매개변수){}
    public int plus(int x, int y){
        int result = x + y;
        return result;
    }

    public int minus(int x, int y) {
        int result = x - y;
        return result;
    }
    public int Multiplication(int x, int y) {
        int result = x * y;
        return result;
    }
    public int division(int x, int y) {
        int result = x / y;
        return result;
    }
    public int divisin(int x, int y) {
        int result = x % y;
        return result;
    }
}
