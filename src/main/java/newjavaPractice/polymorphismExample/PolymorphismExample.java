package newjavaPractice.polymorphismExample;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makesound();
        animal2.makesound();
    }

}
