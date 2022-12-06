package org.example;

public class Main {
    public static void main(String[] args) {


        Aircraft helicopter1 = new Helicopter("Denel Ah-2", 2, 5.185, 5730,
                18.73, 704, 309, 2,  3.05,
                31.16);

        Aircraft helicopter2 = new Helicopter("EC-145", 2, 3.96, 1792,
                13.03, 705, 278, 2,1.96,
                20);


        System.out.println("\nAbout helicopter " + helicopter1.getName() + "\n" + helicopter1);

        System.out.println("About helicopter " + helicopter2.getName() + "\n" + helicopter2);

    }
}