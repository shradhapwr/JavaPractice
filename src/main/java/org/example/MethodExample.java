package org.example;

public class MethodExample extends Employee{


    static int s =100;
    int g =0;
    //static void method1(){

      //  System.out.println("static method");
    //}

//    void method2(){
//        s=1000;
//        int a=1;
//
//        MethodExample obj1 = new MethodExample();
//        obj1.g = 222;
//        System.out.println("non static method");
//        System.out.println(a);
//    }

    static void parameterized(String name, int age){
        System.out.println(name+age);
    }


    public static void main(String[] args) {
//        method1();
//
//        MethodExample obj1 = new MethodExample();
//        obj1.method2();

//        parameterized("Shradha",24);
//        // s=12;
//        //obj1.g=22;
//        System.out.println(s+" "+ obj1.g);
//        int a=2;
//        System.out.println(a);

        method2();
        method1();




    }
}
