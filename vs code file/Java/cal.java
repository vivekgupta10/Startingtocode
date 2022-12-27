import java.util.Scanner;
class cal {
    public static void main(String[] args) {
        System.out.println("hello wecome to a Simple java calculator");
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        Scanner in = new Scanner(System.in);
        for (int i = 3; i < 4;) {
            System.out.println("Enter your choice");
            int c = in.nextInt();
            System.out.println("Enter first number");
            int f1 = in.nextInt();
            System.out.println("Enter second number");
            int f2 = in.nextInt();
            switch (c) {
                case 1->System.out.println("The answer is "+(f1+f2));           
                case 2-> System.out.println("The answer is "+(f1-f2));
                case 3 -> System.out.println("The answer is"+(f1*f2));
                case 4 -> System.out.println("The answer is "+(f1/f2));
                default-> System.out.println("You have chosen a wrong choice");        
            }

            System.out.println("press 1 to exit "+"\n"+"press 2 to do other calculation");
            int o = in.nextInt();
            if(o==1){
                break;
            }
            else if(o==2){
                continue;
            }


          

            
        }
    }
}
