package org.opentutorials.javatutorials.progenitor;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        // Student s = obj; 자식의 object를 부모의 object로 바꾸는 것은 자유로움
        // 부모의 object를 자식의 object로 바꾸려면 형변환 필요
        // obj 데이터 타입을 (Student) 데이터 타입으로 강제 형변환
        Student s = (Student)obj;
        return this.name == s.name;
    }
}

class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}