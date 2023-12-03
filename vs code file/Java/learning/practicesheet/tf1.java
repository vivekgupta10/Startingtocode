
import java.util.Scanner;

public class tf1{
 public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Write the value of a");
        float a = in.nextFloat();        
        System.out.println("Write the value of b");
        float b = in.nextFloat();
        System.out.println("Write the value of c");
        float c = in.nextFloat();
        
        float sum = (b*b-4*a*c)/(2*a);

        System.out.println(sum);
        


        
        
    }     
    

    
}
