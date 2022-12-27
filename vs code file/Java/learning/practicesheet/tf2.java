import java.util.Scanner;

public class tf2 {
 public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the initial velocity(u)");
        float u = in.nextFloat();
        System.out.println("Enter the final velocity(v)");
        float v = in.nextFloat();

        float sum = v*v-u*u;

        System.out.println(sum);
        
            

        
        
    }     
    

    
}
