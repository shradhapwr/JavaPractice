package newjavaPractice.inheritancePractice;

public class InheritanceExample {

    public static void main(String[]args){
        // Creating an instance of the Car class
        Car myCar = new Car("Toyota",4);
        // Accessing inherited property and method from the parent class
        System.out.println("Brand: " + myCar.Brand);
        myCar.start(); // Output: Starting the Toyota vehicle.

        // Accessing the property and method specific to the child class
        System.out.println("Number of Doors: " + myCar.NoOfDoors);
        myCar.honk(); // Output: Honk! Honk!
    }

}
