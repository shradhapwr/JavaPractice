package org.example;

public class People {

    int g =10;
    int h =5;
    String color;
    String caste;
    int age;

//    People(String caste,String color,int age){
//        //this.caste = caste;
//        //this.color = color;
//        this.age = age;
//    }

    public static void main(String[] args){
        nirmalFamily();
        pawarFamily(1,"Maratha","Black",30);
        pawarFamily(2,"maratha","brown",30);
    }

    public static void nirmalFamily(){
        People balu = new People();
        balu.color = "black";
        balu.age=60;
        balu.caste="maratha";
        System.out.println(balu.color+" "+balu.caste+" "+ balu.age );

    }

    public static void pawarFamily(int i,String caste, String color, int age){
//        People om = new People("maratha","black",28);
//        People gaurav = new People("maratha","brown",34);
 People om = new People();
People gaurav = new People();
        System.out.println(i);
        System.out.println("om"+caste + " "+color + " "+ age);

//        System.out.println(om.caste + " "+om.color + " "+ om.age);
     System.out.println("gaurav"+caste + " "+color + " "+ age);
    }

    People(){

    }





}
