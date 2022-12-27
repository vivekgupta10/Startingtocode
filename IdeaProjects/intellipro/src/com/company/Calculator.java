/*
            SUMMARY
This is the simple java from for making the calculator using java
Making calculator with java is the best thing if you are a beginner as it help to make concept more clear in java.
So lets make a calculator using java:-
1. First Take make a simple java template as shown below
2. Then import and make the object of the Scanner
3. Then make a Integer where a user can enter his number
4. Then make another Integer to enter another number
5. Now write a simple program logic to add those two number
6. Then print the result.
This is how you can make your fist simple java calculator projects.
To make it more clear see the code below
 */

package com.company; // Write the package of your code
import java.util.Scanner;// import java.util.Scanner for taking the inputs
public class Calculator { // This is our main class so add the name to your current file name
    public static void main(String[] args) {// This is our main methord. The execution of our program starts from here
        Scanner in = new Scanner(System.in);// Make the object of the Scanner
        System.out.println("Enter the first number");// Ask user to input a number
        int a = in.nextInt();// Make first integer and take input from the user using scanner class
        System.out.println("Enter another number");// Ask user to input another number
        int b = in.nextInt();// // Make another integer and take input from the user using scanner class
        int sum = a+b;// Make another integer to store sum of the above two numbers
        System.out.println("The answer is: "+sum);// Now print the sum of those two numbers
    }// End of main methord
}// End of the class
/*
Hope you find this code helpful for making the calculator using java
Thank you so much for refering our code
You can log in to www.mgcoder.com for more codes like this
 */
