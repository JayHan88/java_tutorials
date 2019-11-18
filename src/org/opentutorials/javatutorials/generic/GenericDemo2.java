package org.opentutorials.javatutorials.generic;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}

// generic 에 올 수 있는 데이터 type : 참조형 datatype only
// 기본 datatype을 객체로 포장하는 wrapper class 사용 필요
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id) {
        this.info = info;
        this.id = id;
    }
    // method 에서도 generic 사용 가능
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer id = new Integer(1);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, id);
        System.out.println(p1.id.intValue());
        p1.<EmployeeInfo>printInfo(e);
    }
}
