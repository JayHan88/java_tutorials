package org.opentutorials.javatutorials.classinstance;

class C1 {
    static int static_variable = 1; // class 변수
    int instance_variable = 2; // instance 변수

    // class method에서 static 변수에 접근
    static void static_static(){
        System.out.println(static_variable);
    }
    // class method에서 instance 변수에 접근
    static void static_instance(){
        // System.out.println(instance_variable);
    }

    // instance method에서 static 변수에 접근
    void instance_static(){
        System.out.println(static_variable);
    }
    // instance method에서 instance 변수에 접근
    void instance_instance(){
        System.out.println(instance_variable);
    }
}
public class ClassMemberDemo {
    public static void main(String[] args) {
        C1 c = new C1();
        c.static_static(); // 1
        // c.static_instance(); // error = class method에서 instance 변수 접근 불가
        c.instance_static(); // 1
        c.instance_instance(); // 2

        C1.static_static(); // 1 = class를 통해서 직접 class method 접근 가능
        // C1.static_instance(); // error
        // C1.instance_static(); // 아직 instance도 없는데 어떤 instance에 접근해야 하는지 class는 모름
        // C1.instance_instance();
    }
}
