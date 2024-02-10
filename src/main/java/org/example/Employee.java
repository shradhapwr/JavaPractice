package org.example;

public class Employee {
    String name;
    int age;
    String city;
    boolean isManager;


    public static void method2() {
        System.out.println("Method2");

        Employee kushal = new Employee();
        Employee gaurav = new Employee();

        kushal.city = "Thergaon";
        gaurav.isManager = true;

        System.out.println("Kushal " + kushal.city + " " + gaurav.isManager);

    }

    public static void method4() {
        System.out.println("method 4");

    }

    public static void main(String[] args) {
        Employee gaurav = new Employee();
        gaurav.name = "Gaurav";

        Employee shraddha = new Employee();
        shraddha.age = 23;

        Employee amruta = new Employee();
        amruta.isManager = false;

        System.out.println(gaurav.name);
        System.out.println(shraddha.age);
        System.out.println(amruta.isManager);

       employeeNames("Shradha", "Gaurav","Pawar",1);
        employeeNames("Gaurav", "Gautam","Pawar",2);
        employeeNames("Amruta", "Rishi","Tandale",3);
        employeeNames("Sakshi", "Dattatray","Nirmal",4);
        employeeNames("Raj", "","Pawar",5);

    }

    public static void method1() {
        System.out.println("Hello Shraddha");
        System.out.println("Method 1");

    }


    public static void method3() {
        System.out.println("Method3");

    }

    Employee() {

    }

    public static void method5(String name) {
        ;
        char initial;
        int age;

    }

    public static void add(int a, int b,int iteration) {
        int c,d;


        d = a *b;
        c= b - a;
        System.out.println("add "+ iteration);
        System.out.println(d);
        System.out.println("minus" + c);
        System.out.println();
        System.out.println();


    }

    public static void employeeNames (String a,String b,String c, int i){

        System.out.println("iteration"+ i);
        System.out.println(a+ " "+b+" "+c);
        System.out.println("shraddha");
        System.out.println("pawar");
        int iteration = 0;
        String name = "Shraddha";
        name.toCharArray();





    }


}
