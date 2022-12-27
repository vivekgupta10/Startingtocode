import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        float num1 = in.nextFloat();
        System.out.println("Enter the second number");
        float num2 = in.nextFloat();
        System.out.println("Enter the third number");
        float num3 = in.nextFloat();

        System.out.print("The sum of three number is: ");
        float sum = (num1+num2+num3);
        System.out.println(sum);
    }    
}
