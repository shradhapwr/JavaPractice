package newjavaPractice.inheritancePractice;

 class Car extends Vehicle{
     int NoOfDoors;
     public Car(String Brand, int NoOfDoors) {
         super(Brand);   // Call the constructor of the parent class
         this.NoOfDoors = NoOfDoors;
     }
     //one more method in child class -
      public void honk(){
          System.out.println("Honk!!!!");
      }


 }
