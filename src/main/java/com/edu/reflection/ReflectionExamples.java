package com.edu.reflection;

public class ReflectionExamples {

    /*   public static void main(String[] args) throws ClassNotFoundException {
           Class c = Class.forName("com.edu.reflection.Simple");
           System.out.println(c.getName());
       }*/
   /* public void printName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());
    }

    public static void main(String args[]) {
        Simple s = new Simple();
        ReflectionExamples t = new ReflectionExamples();
        t.printName(s);
    }*/
    public static void main(String args[]) {
        Class c = boolean.class;
        System.out.println(c.isPrimitive());

        Class c2 = ReflectionExamples.class;
        System.out.println(c2.getName());
        //System.out.println(c2.getSuperclass());

    }
}

