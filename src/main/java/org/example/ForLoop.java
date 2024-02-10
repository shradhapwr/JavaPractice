package org.example;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i ++) {
            System.out.print("i="+i+" ");
            for (int j = 1; j <= 10; j ++) {
                System.out.print("*");
            }
            System.out.println("");

        }
//        int i =14;
//        for (int j = 1; j <= i; j ++) {
//            System.out.print("*");
//        }


//        if(i%2==0){
//            System.out.println("**");
//        } else {
//            System.out.println("*");
//        }
    }
}
