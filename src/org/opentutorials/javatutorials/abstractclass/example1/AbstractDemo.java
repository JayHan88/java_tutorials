package org.opentutorials.javatutorials.abstractclass.example1;

abstract class A {
    public abstract int b();
    // 메소드 b는 abstract 메소드임
    // class A를 상속받은 클래스가 메소드 b를 overriding 해야 함.

    // public abstract int c() { System.out.println("Hello"); }
    // 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.

    public void d(){
        // abstract 클래스 A는 내부 로직이 있는 구체적인 메소드를 가질 수 있다.
        System.out.println("world");
    }
}

class B extends A{
    public int b(){
        return 1;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        // A obj = new A();
        B obj = new B();
    }

}
