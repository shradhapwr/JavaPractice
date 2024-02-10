package org.example;

public class Person {
    int a, b;
    public static void main(String[] args) {
       int a=10,b=20;
        System.out.println(a+ " "+b);
       method1();
       method2();

    }
   static void method1(){
        int a=100,b=200;
        Person p1 = new Person();
        p1.a = 400;
        p1.b = 500;

        Person p2 = new Person();
        p2.a = 400;
        p2.b =123;
       System.out.println(a+ " "+b);
    }

   static void method2(){
        int a=1000,b=2000;
       System.out.println(a+ " "+b);
    }

}
