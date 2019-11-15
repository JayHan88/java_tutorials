package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
    static void a() {
        int i = 0; // method 안에서만 유효한 변수 : 유효범위, scope
    }

    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
            a();
            System.out.println(i);
        }
    }
}

