package org.opentutorials.javatutorials.overriding.example1;

class Calculator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    @Override
    public void sum() {
        System.out.println("실행 결과는 " + (this.left + this.right) +"입니다.");
    }

    public int avg() {
        return super.avg();
        // return ((this.left + this.right) / 2);
    }
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }

}

// 메소드 overriding 조건
// 메소드의 이름
// 메소드의 매겨변수의 숫자와 데이터 타입 그리고 순서
// 메소드의 리턴 타입