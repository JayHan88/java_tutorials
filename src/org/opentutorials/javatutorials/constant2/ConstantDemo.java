package org.opentutorials.javatutorials.constant2;

/*
class Fruit{
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
} */
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    public String getColor(){
        return this.color;
    }
    // 생성자 정의
    // 상수들이 instance 화 될 때마다 생성자가 호출됨
    // 3개의 상수를 호출하기 때문에 3번의 생성자가 호출됨
    Fruit(String color) {
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
}
enum Company{
    GOOGLE, APPLE, ORACLE
}

public class ConstantDemo {
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, color "+Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit.BANANA.getColor());
                break;
        }

        for(Fruit f : Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }
    }
}
