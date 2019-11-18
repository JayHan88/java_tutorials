package org.opentutorials.javatutorials.generic;


// T : T의 datatype은 info인데, 정의할 떄 info를 정의하지 않고 후에 하는
class Person1<T>{
    public T info;
}

public class GenericDemo {

    public static void main(String[] args) {
        // info : String
        Person1<String> p1 = new Person1<String>();
        // info : StringBuilder
        Person1<StringBuilder> p2 = new Person1<StringBuilder>();
    }

}