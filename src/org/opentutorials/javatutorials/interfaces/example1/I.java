package org.opentutorials.javatutorials.interfaces.example1;

interface I{
    public void z();
}

// class A는 interface I를 구현한다.
class A implements I{
    // interface I에서 정의된 method z를 반드시 구현해야 한다.
    public void z(){}
}