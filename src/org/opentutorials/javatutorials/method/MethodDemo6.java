package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
    // numbering : method 이름
    // String : nubmering이라는 method가 return 할 값의 type은 String이다.
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }
        return output;
    }

    //void : 비어 있는 - void로 표현된 method는 아무런 값을 return하지 않는다.
    public static void main(String[] args) {
        String result = numbering(1,5);
        System.out.println(result);
    }
}
