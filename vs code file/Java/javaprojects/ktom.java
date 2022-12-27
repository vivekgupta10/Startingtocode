import java.util.Scanner;
public class ktom {

    public static void main(String[] args) {
        for (int i = 0; i < 1; ) {   
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value in km");
    float km = in.nextFloat();
    System.out.println("Answer is "+(km*0.621f)+"\n"+"Press 1 to continue"+"\n"+"Press any number key except 1 to exit");
    int o = in.nextInt();
    if(o==1){
        continue;
    }
    else {
        break;
    }
    
        }
    }
}