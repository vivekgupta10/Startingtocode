package com.company;
import java.util.Scanner;
import java.util.Random;
class chosenum{
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    int x = r.nextInt(100);
    int c = 10;
    void main(){
        while(true) {
            System.out.println("Enter the number of your choice");
            int t = in.nextInt();
            if (t == x) {
                System.out.println("you win");
                System.out.println("your point is " + (100 - c * 10));

                break;
            } else if (t < x) {
                System.out.println("Entered number is less than choosen number");
                System.out.println("Please try again");
                c++;
                continue;
            } else if (t > x) {
                System.out.println("Entered number is greater than choosen number");
                System.out.println("Please try again");
                c++;
                continue;
            } else {
                System.out.println("Sorry invalid chance");
                continue;
            }
        }
    }
}
class rps{
    Random r = new Random();
    Scanner in = new Scanner(System.in);
    private int x = r.nextInt(2);
    int y;
    int p = 0;
    int u = 0;
    void main(){
        x++;
        System.out.println("Enter how many match do you want");
        int l = in.nextInt();
        for (int i = 0; i < l; i++) {


            System.out.println("Enter your choice \n 1.rock \n 2.paper \n 3.Scissor");
            y = in.nextInt();
            if (x == y) {
                System.out.println("Draw match");
            }
            //human loose
            else if (x == 1 && y == 3 || x == 2 && y == 1 || x == 3 && y == 2) {
                System.out.println("you loose");
                p++;
            }
            else if (y == 1 && x == 3 || y == 2 && x == 1 || y == 3 && x == 2) {
                System.out.println("You win");
                u++;
            }

        }
        if(u==p){
            System.out.println("GAme draws");
        }
        else if(u>p){
            System.out.println("you win");
        }
        else if(p>u){
            System.out.println("you loose");
        }
        else{
            System.out.println("Result error");
        }
        }

    }

public class Main{
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        // Here to made the object from your class
     chosenum c = new chosenum();//1st game
     rps r = new rps();//2nd game
        // here add the name of your game
        System.out.printf("Enter which game do you want to play \n 1.choose the number game \n 2.rock paper scissor\n");
        int x = in.nextInt();
        //here add functioning of your game
        if(x==1){
            c.main();
        }
        else if(x==2){
            r.main();
        }
        else{
            System.out.println("Wrong choice");
        }
    }
}