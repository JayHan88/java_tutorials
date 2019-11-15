package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
    /* method */
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    /* main : java가 실행될 때 호출하는 약속 */
    public static void main(String[] args) {
        numbering();
    }
}

