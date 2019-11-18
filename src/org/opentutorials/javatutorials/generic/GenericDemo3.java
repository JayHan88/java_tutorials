package org.opentutorials.javatutorials.generic;

interface Info{
    int getLevel();
}
class EmployeeInfo1 implements Info{
    public int rank;
    EmployeeInfo1(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}

// Info class 자신이나 자식들만 T로 받겠다.
class Person2<T extends Info>{
    public T info;
    Person2(T info){
        this.info = info;
        info.getLevel();
    }
}
public class GenericDemo3 {
    public static void main(String[] args) {
        Person2<EmployeeInfo1> p1 = new Person2<EmployeeInfo1>(new EmployeeInfo1(1));
        // Person2<String> p2 = new Person2<String>("부장");
    }
}