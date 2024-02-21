package newjavaPractice.inheritancePractice;

public class Vehicle {
    String Brand;

    //Constructor
    public Vehicle(String Brand){
    this.Brand = Brand;
    }

    //method
    public void start(){
        System.out.println("Starting the"+ Brand +"vehicle");
    }
}
