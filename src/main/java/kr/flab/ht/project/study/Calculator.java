package kr.flab.ht.project.study;

public class Calculator {

    public static void main(String[] args){//매개 변수
        System.out.println("지금부터 계산기 프로그램을 시작합니다!");
        Calculator calc = new Calculator();//지역 변수

        int a = 10;//지역 변수
        int b = 2;//지역 변수

        System.out.println("add = " + calc.add(a, b));
        System.out.println("div = " + calc.divide(a,b));
        System.out.println("mul = " + calc.multiply(a,b));
        System.out.println("sub = " + calc.subtract(a,b));

    }

    public int add(int num1, int num2){

        return num1 + num2;
    }

    public int divide(int num1, int num2){

        return  num1 / num2;
    }

    public int subtract(int num1, int num2){

        return  num1 - num2;
    }

    public int multiply(int num1, int num2){

        return  num1 * num2;
    }

}
