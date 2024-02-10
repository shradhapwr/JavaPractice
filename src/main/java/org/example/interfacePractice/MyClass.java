package org.example.interfacePractice;

public class MyClass implements MyInterface {

    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod in MyClass");
    }

    public void anotherMethod() {
        System.out.println("Another method in MyClass");
    }

    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass myObject = new MyClass();

        // Call the implemented method
        myObject.myMethod();

        // Call additional method
        myObject.anotherMethod();


    }
}
