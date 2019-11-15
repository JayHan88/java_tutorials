package org.opentutorials.javatutorials.scope;

class C {
    int v = 10;

    void m() {
        int v = 20; // v라는 변수 중첩, 지역변수가 우선순위가 높음
        System.out.println(v);
        System.out.println(this.v); // this : instance 자체를 의미 , 전역변수를 의미
    }
}

public class ScopeDemo7 {
    public static void main (String [] args) {
        C c1 = new C();
        c1.m();
    }
}
