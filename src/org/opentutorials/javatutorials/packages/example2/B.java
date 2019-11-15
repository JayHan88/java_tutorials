package org.opentutorials.javatutorials.packages.example2;

// example1 package 안에 있는 모든 class를 가져오겠다. : .* 표시
// example1 package 안에 있는 A class를 가져오겠다. : .A 표시
import org.opentutorials.javatutorials.packages.example1.*;
import org.opentutorials.javatutorials.packages.example1.A;

public class B {
    public static void main(String [] args) {
        // 클래스 A가 다른 package에 있기 때문에 import 하지 않으면 load 할 수 없음
        A a = new A();
    }
}
