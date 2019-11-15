package org.opentutorials.javatutorials.object;

// class ~ : 지금부터 ~ 라는 설계도를 알려주겠다.
class Calculator {

    // left, right variable 선언
    int left, right;

    //setOprands method 정의
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // this.left vs left
        // this.left : Calculator class의 instance itself를 의미함 = Calculator라는 object 내에서의 left
        // left : method의 매개변수
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

}

public class CalculatorDemo4 {

    public static void main(String [] args) {

        // Calculator : 객체, new Calculator : 새로운 객체 생성, c1이라는 변수에 저장, c1이라는 변수는 Calculator라는 객체를 담을 수 있는 데이터 타입을 가지고 있는 변수여야 한다.
        // c1 : instance
        // c1이라는 객체의 setOprands, sum, avg method를 사용
        Calculator c1 = new Calculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();

        // left와 right는 c1, c2 라는 instance 소유의 변수이다. (instance 마다 값이 다르다)
        // instance 소유 변수가 아닌, class 소유 변수가 있을까? 있다.
        // class 소유의 변수는 모든 instance 마다 값이 같다.
    }
}
