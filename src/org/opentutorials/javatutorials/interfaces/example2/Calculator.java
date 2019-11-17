package org.opentutorials.javatutorials.interfaces.example2;

class Calculator implements Calculatable{
    int first, second, third;
    public void setOprands(int fist, int second, int third) {
        this.first = fist;
        this.second = second;
        this.third = third;
    }
    public int sum() {
        return this.first + this.second + this.third;
    }
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}