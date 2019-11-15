package org.opentutorials.javatutorials.overloading.example1;

// Overloading : 같은 이름의 메소드, 하지만 다른 매개변수를 가지는 메소드를 정의해야 할 때 사용하는 방법

class Calculator {
    int left, right;
    int third = 0;

    public void setOprands(int left, int right) {
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third) {
        this.setOprands(left, right);
        System.out.println("setOprands(int left, int right, int third)");
        this.third = third;
    }

    public void sum() {
        System.out.println(this.left + this.right + this.third);
    }

    public void avg() {
        System.out.println((this.left + this.right + this.third)/3);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();
    }

}
