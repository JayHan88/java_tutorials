package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i; // 전역변수

    static void a() {
        i = 0; //전역변수 i에 0을 할당하는 메소드
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}

