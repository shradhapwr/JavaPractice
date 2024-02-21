package org.example;

abstract class Beavarages {
    String description;

    // Constructor
    public Beavarages(String description) {
        this.description = description;
    }

    // Abstract method
    abstract double cost();

    // Concrete method
    void display() {
        System.out.println("Description: " + description);
        System.out.println("Cost: $" + cost());
    }
}

// Concrete subclass
class Coffee extends Beavarages {
    // Constructor
    public Coffee() {
        super("Coffee");
    }

    // Implementing abstract method
    @Override
    double cost() {
        return 2.5;
    }

    public void display() {
    }
}

// Concrete subclass
class Tea extends Beavarages {
    // Constructor
    public Tea() {
        super("Tea");
    }

    // Implementing abstract method
    @Override
    double cost() {
        return 1.8;
    }
}

// Main class
class main {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        Tea myTea = new Tea();

        // Using abstract methods
        myCoffee.display();
        myTea.display();
    }

}
