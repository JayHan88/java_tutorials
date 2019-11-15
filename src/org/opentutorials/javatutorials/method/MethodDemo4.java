package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
    /* numbering method가 int type의 limit이라는 변수를 받을 수 있다고 표*/
    /* int limit : 매개변수, parameter */
    public static void numbering(int limit) {
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }

    /* parameter 값 : 인자, argument */
    public static void main(String[] args) {
        numbering(5);
    }
}
