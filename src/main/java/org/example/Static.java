package org.example;

public class Static {
    // static method
    static void m1()
    {
        System.out.println("from m1");
    }

    public static void main(String[] args)
    {
        // calling m1 without creating any object of class Test
        m1();
    }


}
