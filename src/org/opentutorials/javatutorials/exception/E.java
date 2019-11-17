package org.opentutorials.javatutorials.exception;

import java.io.IOException;

class E {
    // ArithmeticException : runTime class 있음 : unchecked : 예외처리 불필요
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    // IOException : runTime class 없음 : unchecked : 예외처리 필요
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException {
        throw new IOException();
    }
}
