package com.edu.reflection;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

    public static void main(String args[]) {
        try {
            Class c = Class.forName("com.edu.reflection.Simple");
            //Class arr = String[].class;
            Simple s = (Simple) c.getDeclaredConstructor().newInstance();
            System.out.println("Annotations");
            System.out.println(Arrays.toString(c.getAnnotations()));
            Method[] meth = c.getDeclaredMethods();
            //System.out.println("IS Array?" + arr.isArray());
            //System.out.println("Is Interface : "+ Runnable.class.isInterface());
            System.out.println(Arrays.toString(meth));
            for (Method m : meth) {
                m.setAccessible(true);
                m.invoke(s, null);
            }
            //Method m =c.getDeclaredMethod("message", null);


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
