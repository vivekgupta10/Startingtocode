package com.company;

import java.util.Scanner;

class cone {
    // This is class form making of cone
    double r;
    double l;
    Scanner in = new Scanner(System.in);
    public void con(){
        System.out.println("Enter your choice\n" +
                "1. Take out the slant height\n" +
                "2. Take out the Total Surface area\n" +
                "3. Take out Curved/Lateral surface area\n");
        int c = in.nextInt();
            if (c == 1){
                // call for slant height
                sh();
            }
    }
    public void sh(){ // Here all work is done
        System.out.println("Enter height");
        double a = in.nextInt();
        System.out.println("Enter radius");
        double b = in.nextInt();
        r = b;
        System.out.println(a*a+b*b);
        l = Math.sqrt(a*a+b*b);
        System.out.println(l);
        tsa();
    }
    public void tsa(){
        System.out.printf("22 X %.2f X %.2f\n",r/7,l+r);
        System.out.println(22*(r/7)*(l+r));
    }
    public void csa(){
        System.out.println(22*(r/7)*l);
    }
}
public class areacal {
    public static void main(String[] args) {
        // This is the main class and the execution of programs starts from here
        cone c = new cone();
        c.con();

    }
}
