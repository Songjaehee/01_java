package main.java.com.ohgiraffers.section01.method;

public class intro {
    public static void main(String[] args) {

        String name = "송재희";
        int age = 27;
        char gender = '여';
        String phonenumber = "010-4020-0723";

        intro introduce = new intro();

        String info = introduce.myInfo(name,age,gender,phonenumber);
        System.out.println(info);

    }

    public String myInfo(String name, int age, char gender, String phonenumber) {

        String result = name + age + gender + phonenumber;
        return result;

    }
}



