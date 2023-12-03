package javaprojects;

import java.util.Scanner;

public class greet{
    public static int cheak() {
        Scanner in = new Scanner(System.in);
        while(true){try{
            int a = Integer.parseInt(in.nextLine());
            return a;
        }catch(Exception e){
            System.out.println("Sorry your have input something wrong please try again: ");
        }
    }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int b= cheak();
    }
}