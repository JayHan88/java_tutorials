package org.opentutorials.javatutorials.classinstance;

class Calculator3 {

    // static 있음 : class method - instance member 접근 불가
    // static 없음 : instance method - class member 접근 가능
    public static void sum(int left, int right){
        System.out.println(left + right);
    }

    public static void avg(int left, int right){
        System.out.println((left + right)/2);
    }
}
public class CalculatorDemo3 {
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
}
