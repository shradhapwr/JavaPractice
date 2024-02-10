package org.example;

public class AccessEncapsulation {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setColor("white");
        e.setMake("Suzuki");
        System.out.println("e");
        System.out.println(e.getColor());

        Encapsulation e1 = new Encapsulation("suzuki");
        System.out.println("e1");
        System.out.println(e1.getMake());
        Encapsulation e2 = new Encapsulation("suzuki","white");
        System.out.println("e2");
        System.out.println(e2.getColor());
        System.out.println(e2.getNoOfWheels());
        System.out.println("e3");
        Encapsulation e3 = new Encapsulation("suzuki","dezire",2015,"white",4);
        System.out.println(e3.getNoOfWheels());
        System.out.println(e3.getMake());
        System.out.println(e3.getModel());
        System.out.println(e3);

    }
}
