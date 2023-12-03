import java.util.Scanner;
class percal {

    public static void main(String[] args) {
      Scanner in =  new Scanner(System.in);
            System.out.println("Enter the total marks of one subject");
            float m1 = in.nextFloat();
            System.out.println("Enter the total subjects");
            int nof = in.nextInt();
            float tm = (nof*m1);
            float tma = 0;
            for (int i = 1; i <=nof; i++) {
              System.out.println("Enter the marks of the subject");
               float inp = in.nextFloat();
               if (inp>m1) {
                 for (int j = 0; j < 2; ){
                   System.out.println("The number entered if greater than total marks");
                   System.out.println("Please enter again!");
                   inp = in.nextFloat();
                   if(inp>m1){
                     continue;
                  }
                  else if(inp<=m1){
                
                    break;
                  }
                }
                
              }
              tma = tma + inp;
            }
              float per =( tma*100)/tm;
            System.out.println("your percentage is : "+per);
           if (per<33) {
            System.out.println("Fail");
            if (per<33&&per>=30) {
              System.out.println("bad but keep improving for passing marks");
              
            }
            else if (per<30&&per>20){
              System.out.println("bad but keep improving");
            }
            else if(per<20&&per>10){
              System.out.println("very bad you are not paying attention to studies");
            }
            else if (per<10&&per>=0){
              System.out.println("worst marks ever Your should work extremly very hard to score at least marks");

            }
            
           }     
            if(per>=33){
            System.out.println("Pass");
            if (per<=33&&per<40) {
              System.out.println("your are just pass ");
            } 
            else if(per>=40&& per<50){
              System.out.println("Need more improvement");
            }
            else if (per>=50&&per<60){
              System.out.println("Average student score more for better");
            }
            else if(per>=60&&per<70){
              
              System.out.println("Above average student.If you give more time to studies your marks will gradually improve");
            }
            else if(per>=70&&per<80){
              System.out.println("Good , you are doing well in your exam");
            }
            else if(per>=80&&per<90){
              System.out.println("very good,your are very good and above than average");
            }
            else if(per>=90&&per<100){
              System.out.println("Excellent performance doing very well in exam");
            }
            else if(per==100){
              System.out.println("Outstanding performance, you are above than all");
            }

           }
          
              
          }
          }
            
           
            
          
            
        
        

            
        

