import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class testing {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();

        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        
        
        String a = "        hello     ";
        System.out.println(a);
        System.out.println(a.replace( "", "_"));
        
         String letter = "Dear "+"how "+"Welcome to this serires";
         String h = in.nextLine();
         System.out.println("Enter your name");
         System.out.println(letter.replace("how", h)
         problem 4
         String c = in.nextLine();
         int r1 = c.indexOf("  ");
         int r2 = c.indexOf("   ");
         if (r2!=-1){
             System.out.println("This contains triple spcaes");
         }
         else if (r1!= -1){
             System.out.println("The syntax contain double spaces");

         }   
             
         
    }
}
    

