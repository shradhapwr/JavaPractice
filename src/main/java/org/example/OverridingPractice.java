package org.example;

public class OverridingPractice {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.makeSound();
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
//        System.out.println(cat.name);

//        dog.makeSound();
//        System.out.println(dog.name);
    }
}

class Animal {
    String name;

    void makeSound() {
        System.out.println("default sound");
    }


    public static void main(String[] args) {

        Animal animal = new Animal();
//        animal.makeSound();
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
    }
}

class Cat extends Animal {
    void makeSound() {
      int a = 20;
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
//        animal.makeSound();
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.makeSound();
    }

}

class Dog extends Animal {
    void makeSound(){
        int a= 10+30;
        System.out.println(a);

    }
}


