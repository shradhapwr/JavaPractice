package org.example;

public class Person2 {
    int a = 10, b = 20;

    Person2() {
        System.out.println("nusta constructor");
    }

    Person2(int a, int b) {
        this.a=a;
        this.b=b;
        System.out.println("parameter constructor:" + this.a + " " + this.b);
    }

    static void method2(int a, int b) {
        Person2 p1 = new Person2();
        p1.a = a;
        p1.b = b;

        System.out.println("p1:" + p1.a + " " + p1.b);

    }

    public static void main(String[] args) {
//        method2(123, 456);


        Person2 p2 = new Person2();
//        p2.a = 100;
//        p2.b = 200;
        System.out.println("p2:" + p2.a + " " + p2.b);

        Person2 p3 = new Person2(126, 456);
//        p3.a =1000;
//        p3.b =2000;
        System.out.println("p3:" + p3.a + " " + p3.b);


//        Person2 p4 = new Person2();
//        p4.a =10000;
//        p4.b =20000;
//        System.out.println("p4:" + p4.a + " " + p4.b);
    }


    static void method3(int a, int b) {
        a = 300;
        b = 900;
    }

    static void method4() {
        int a = 423, b = 447;

    }
}
