import java.util.Scanner; 

public class cal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input marks of first subject");
        float a = in.nextFloat();
        System.out.println("input marks of second subject");
        float b = in.nextFloat();
        System.out.println("input marks of third subject");
        float c = in.nextFloat();
        System.out.println("input marks of fourth subject");
        float d = in.nextFloat();
        System.out.println("input marks of fivth subject");
        float e = in.nextFloat();

        float suma = (a+b+c+d+e);
        float sumb = (suma/500);
        float sumc = (sumb*100);
        System.out.print("The percentage of student is:");
    System.out.println(sumc);






    }

    
}