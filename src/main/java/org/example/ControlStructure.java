package org.example;



public class ControlStructure {

    public static void main(String[] args) {
        int a = 6;
        if (a == 10) {

            System.out.println("Shradha");
        } else if (a < 10) {
            System.out.println("Raj");
        } else {
            System.out.println("Amruta");
        }

        switch (a) {
            case 10:
                System.out.println("TRUE STATEMENT");
                break;
            case 5:
                System.out.println("false");
                break;
            case 6:
                System.out.println("false22");
                break;
            default:
                System.out.println("fact");
                break;
        }

        for (int i = 1; i <= 10; i ++) {
            System.out.println("*");
        }


        int j = 1;
        while (j <= 20) {
            System.out.println("*");
            j = j+2;

        }

    }

}



