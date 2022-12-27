package com.company;
/*
1. aval class contains all the main funciton

 */
import java.util.Scanner;
class acal{
    Scanner in = new Scanner(System.in);//
    public float fcheck(){
        while(true){
        try {
            float a = Float.parseFloat(in.nextLine());
            return a;
        } catch (Exception e) {
            System.out.println("You have entered something wrong please enter again");
        }
        }
    }
    public char ccheck(){// In this class we check the operated inputed is a valid character or not
        while(true){
            try {
                char a = in.next().charAt(0);
                String s = in.nextLine();
                if(a=='*'||a=='/'||a=='+'||a=='-'||a=='%'||a == '^'||a=='r'||a=='d'){// Here another operator may be update
                    return a;
                }else{
                    throw new Exception("Error");
                }

            } catch (Exception e) {
                System.out.println("Please enter again");
            }
        }
    }
    public acal(){
        System.out.println("This program contains following symbols:\n" +
                "1. + for addition\n" +
                "2. - for subtraction \n" +
                "3. * for multiplication \n" +
                "4. / for division\n" +
                "5. % for percentage\n" +
                "6. ^ for power\n" +
                "7. r for root \n" +
                "8. d for the discount calculation\n");// update the symbol for user here
        System.out.println("Enter the first number");
        float a = fcheck();
        System.out.println("Enter the operator");
        char o = ccheck();
        System.out.println("Enter second number");
        float b = fcheck();
        cal(a,o,b);
    }

    public void cal(float a , char o , float b){// a = first num : o = operator: b = second num
        float sum = 1;//This will the sum which is output
        // This if else ladder check which operation is to be performed in respect to the operator entered
        if(o=='+'){
            sum = a+b;
        }else if(o=='-'){
            sum = a-b;
        }else if(o=='*'){
            sum = a*b;
        }else if(o=='/'){
            try {// AS there are sum rules for division for ex: divided with zero
                sum = a/b;
            } catch (Exception e) {
                System.out.println("Sorry can't divide");
        }
        }else if(o=='%'){
                sum = (a*b)/100.0f;
            }else if(o=='^'){
            for (int i = 0; i < b; i++) {
                sum *= a;
            }
        }else if(o=='r'){
            sum = (float)Math.sqrt(a);
        }else if(o=='d'){
            sum = (a-(a/100.0f)*b);
            System.out.println("Your save rupee: "+(b*(a/100.0f)));
        }// here a = first number i.e sum and b = second number and sum = your answer to print
            // Here another operation can be update
            else{

            System.out.println("ERROR!");
        }

        System.out.println(sum);// Here to print the sum

        a = sum;// Now the sum will become the first number
        System.out.println("Enter the operator");
        o = ccheck();// Here operator will be entered
        System.out.println("Enter the another number");
        b = fcheck();// Here another number will entered
        cal(a,o ,b);// This if a loop
    }

}
public class advance_calculator{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        acal n = new acal();


    }
}
