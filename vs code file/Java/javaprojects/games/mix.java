package games;
import java.util.*;
class rpsgame{
  Random r = new Random();
  // rules of game
  int l;
  int m;
  void intro(){
    System.out.println("Game rule:");
        System.out.println("Enter 0 for rock");
        System.out.println("Enter 1 for paper");
        System.out.println("Enter 2 for scissor");
  }
  //computer decision
  int c = r.nextInt(3);
  //human input methrod
  int hd;
  void humaninp(int x){
    hd = x;

    }
    //main process
    void ifelseladder(){
        if(hd>2){
            System.out.println("Wrong decision");
        }

        else if (c == hd){
            System.out.println("your decison match with compter decision");
            System.out.println("This is a tic round");
        }

        else if (hd == 0 && c ==1){
            System.out.println("Your dicison rock");
            System.out.println("Computer decision paper");
            System.out.println("Computer wins");
            m++;
            
        }
        else if (hd == 0 && c == 2 ){
            System.out.println("Your decison rock");
            System.out.println("Computer decision scissor");
            System.out.println("You win");
            l++;
        }
        else if (hd == 1 && c ==0 ){
            System.out.println("Your decision paper");
            System.out.println("Computer decison Rock");
            System.out.println("You win");
            l++;
        }
        else if (hd == 1 && c == 2){
            System.out.println("Your decision paper");
            System.out.println("Comptuer decision scisor");
            System.out.println("Computer wins");
            m++;
        }

        else if (hd==2 && c ==0){
            System.out.println("Your dicison is scissor");
            System.out.println("Computer decison is rock");
            System.out.println("Computer wins");
            m++;
        }
        else if (hd==2 && c ==1){
            System.out.println("Your dicison was scissor");
            System.out.println("Computer dicision was paper");
            System.out.println("you won");
            l++;
        }

    }
    void score(){
        if(m==l){
            System.out.println("This is tie round");
        }
        else if (m>l){
            System.out.println("Your score "+l+"\n"+"computer score"+m+"\n"+"Computer  wins ");
        }
        else if (m<l){
            System.out.println("Your score "+l+"\n"+"computer score"+m+"\n"+"You win ");
        }
    }
    }
  

class game{
    int y;
    int x;
    int l = -1;
    void setofguess(){
        l++;
    }
    int getguess(){
        return l;
    }
    Random r = new Random();
    public game(){
         x = r.nextInt(100);
    }
    void userinput(int x){
     y = x;
        
    }
    boolean isnumbercorrect(){
        if(x==y){
            System.out.println("yes your answer is match with computer answer");
            return true;
        }
        else if(y>x){
            System.out.println("Your answer is greater than the computer answer");
            return false;
        }
        else if(y<x){
            System.out.println("your answer is less than the computer answer");
            return false;
        }
        else{
            return false;
        }
    }
}
public class mix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        game guess = new game();
        rpsgame rps = new rpsgame();
        System.out.println("Hello welcome to java games"+"\n"+"Enter your choice"+"\n"+"1. guess the number game"+"\n"+"2.rock paper scissor game"+"\n"+"0.exit"); int t = in.nextInt();

        if (t == 1) {
          
          do {
              guess.setofguess();
              System.out.println("Enter your choice");
              guess.y = in.nextInt();
  
          } while ((!guess.isnumbercorrect()));
          System.out.println("your score is :"+ (100-guess.getguess()*8));
          
        }
        else if (t==2){
            rps.intro();
            for (int i = 0; i < 3; i++) {
            int x;
            do{
                System.out.println("please enter a choice");
                 x = in.nextInt()    ;

            }while(x>2);
                rps.humaninp(x);
                rps.ifelseladder();               
            }
            rps.score();
    }
    }
}