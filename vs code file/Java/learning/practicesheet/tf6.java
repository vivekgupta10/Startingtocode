import java.util.Scanner;
public class tf6 {

  public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          // problem 1
          /*
          float [] arr = {1,2,3,4,5};
          float sum = 0;
          for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
          }
          System.out.println(sum);
           */
          
           // problem 2
           /*
           int [] arr = {10,20,30,40};
           System.out.println("Write a number to find in the array");
           int inp = in.nextInt();
           for (int i = 0; i < arr.length; i++) {
                  if(inp==arr[i]){
                    System.out.println("yes the number is present there");
                    break;
                  }
              */     
                
              // Problem 3
              /*
              float [] arr = {80,75,78,68,58,95}; // lenght = 6
              float sum = 0;
              for (float element :arr){
                sum = sum +element;
              }
              float t = sum/arr.length;
              System.out.println(t);
               */

               // problem 5
               /*
               int [] arr = {1,2,3,4,5,6};
               for (int i = arr.length-1; i >= 0; i--) {
                System.out.println(arr[i]);
                
               }
 */
               // problem 6
              // int [] arr = {1,2,3,4,5,6};
               //System.out.println(arr[arr.length-1]);
                        
               String [] arr = new String[5];
               for (int i = 0; i < arr.length; i++) {
                arr[i] = in.next();
               }
               for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
               }
  }
}