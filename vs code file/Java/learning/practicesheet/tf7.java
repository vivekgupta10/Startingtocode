 import java.text.NumberFormat.Style;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTreeUI;
class tfseven{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // problem 1
        /*
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
        */

        // prroblem 2
        /*
        float tm = in.nextFloat();
        float s1 = in.nextFloat();
        float s2 = in.nextFloat();
        float s3 = in.nextFloat();
        float ma = s1+s2+s3;
        float per = (ma*100.0f)/tm;
        if (per>40.0f){
            System.out.println("pass");
        }
        
        else if (per<33.0f){
            System.out.println("fail");
        }
        else if (per>33.0f && per<40.0f){
            System.out.println("almost pass");
        }

        else {
            System.out.println("Try again");
        }
        */

        // problem 3
        /*
        double ic = in.nextInt();

        if (ic<250000){
            System.out.println("You are free from any extra taxes");
        }

        else if (ic==250000 || ic>250000 && ic<500000){
            double tax = (ic*5)/100.0f;
            System.out.println(tax);
            
        }
        else if (ic==500000 || ic>500000 && ic<1000000){
            double tax = (ic*20)/100.0f;
            System.out.println(tax);
        }
        else if(ic==1000000 || ic>1000000){
            double tax = (ic*30)/100;
            System.out.println(tax);
        }
        else {
            System.out.println("Cant execute all of them");
        }
        */

        //problem 4
  /*      int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("You entered a wrong number fool!");
                }
*/

            //problem 5
            /*
            System.out.println("Enter the year");
            int a = in.nextInt();
            int b = a%4;
            if(a<10000 && a>1750 && b ==  0){
                System.out.println("This is a leap year");
            }

            else if ( a>10000 || a<1750){
                System.out.println("This is an invalid date");
            }

            else if (b != 0){
                System.out.println("This is not a leap year");

            }
            
*/

            //problem 6
            /*String url = in.nextLine();
            
            if(url.endsWith(".com")){
                System.out.println("commersial organisation");
            }
            else if (url.endsWith(".in")){
                System.out.println("Indian brand");
            }
            else if (url.endsWith(".ltd")){
                System.out.println("limited company");
            }
            else{
                System.out.println("this is not a registered user");
            }
           */
          

    }
}