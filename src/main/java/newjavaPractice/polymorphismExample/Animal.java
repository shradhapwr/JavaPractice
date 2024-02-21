package newjavaPractice.polymorphismExample;

public class Animal {
    public void makesound(){
        System.out.println("make generic sound");
    }
}

//subclass
class Dog extends Animal{
    @Override
    public void makesound() {
        System.out.println("woof woof");
    }
}

//subclass 2
class Cat extends Animal{
    public void makesound(){
        System.out.println("meow meow");
    }
}


