package com.edu.Interviewtest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/*public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // Get Reference of classs
        String hello = "Hello";
        Class<? extends String> hclass = hello.getClass();
        Class<?> strClass = String.class;
        Class<?> strClassRef = Class.forName("java.lang.String");
        strClass.getSuperclass();
        strClass.getInterfaces();
    }*/


public class PlayWithReflection {

    public static void main(String[] args) throws ClassNotFoundException {

        String personClassName = "com.edu.Interviewtest.Person";
        Class<?> personClass = Class.forName(personClassName);

        System.out.println("Person class = " + personClass);

        Field[] fields = personClass.getFields();
        System.out.println("Fields: ");
        System.out.println(Arrays.toString(fields));

        Field[] declaredFields = personClass.getDeclaredFields();
        System.out.println("DeclaredFields: ");
        System.out.println(Arrays.toString(declaredFields));

        System.out.println("Methods:");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);

        }

        System.out.println("Declared Methods:");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
            System.out.println("-------------");
            int i = method.getModifiers();
            System.out.println(i);
            System.out.println(Modifier.toString(i));
            System.out.println("####################");

        }

        System.out.println("Static Declared Methods:");
        Arrays.stream(declaredMethods)
                .filter(m -> Modifier.isStatic(m.getModifiers()))
                .forEach(System.out::println);

    }
}

