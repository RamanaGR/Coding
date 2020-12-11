package com.edu.classes;

import java.io.*;

public class ExceptionHandling {
    public static void main(String args[]) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("/java7-new-features/src/abc.txt")) {
            String msg = "Welcome to javaCourse!";
            byte byteArray[] = msg.getBytes(); //converting string into byte array
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfully!");
        }
    }
}


//    int a = 0;
//        System.out.println("rest of the code -1");
//                System.out.println("rest of the code -2");
//                System.out.println("rest of the code -3");
//                try {
//                int data = 50 / a; //may throw exception// -4
//                } catch (ArithmeticException e) {
//                System.out.println(e);
//                System.out.println("rest of the code  -4");
//                }
//                System.out.println("rest of the code  -5");
//                System.out.println("rest of the code  -6");
//                System.out.println("rest of the code  -7");