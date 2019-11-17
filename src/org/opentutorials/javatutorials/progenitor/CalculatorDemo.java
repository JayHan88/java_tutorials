package org.opentutorials.javatutorials.progenitor;

class Calculator extends Object{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

    @Override
    public String toString(){
        return super.toString()+", left : "+this.left+", right: "+this.right;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1.toString());
        System.out.println(c1);
        //  org.opentutorials.javatutorials.progenitor.Calculator@61bbe9ba
        // 61bbe9ba : instance 식별값...
    }

}