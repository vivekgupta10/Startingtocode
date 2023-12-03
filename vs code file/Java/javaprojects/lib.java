import java.util.Scanner;

class library {
    Scanner in = new Scanner(System.in);
    private String [] abook = new String [20] ;//availabel book array
    String [] issue = new String [20];//This is array of issued book
    int a = 10;//a means available book number
    int i = 0;//i means issue book number
    void intro(){
        System.out.println("hello welcome to MG's online library");
        System.out.println("Here books are of free of cost and you will issue them for 28 days and return to them to library after you finished reading ");
        System.out.println("MG's online library is a program to serve the best education to the people who can't afford books");
        System.out.println("Please help us to continue our serving by donating us ");
        System.out.println("Thank you for reading");
        mp();
    }
    //this array library consist of pre-existing books 
    library(){
        abook[0]="Rd sharma maths 9th";    abook[1]="Hc verma physics 9th";abook[2]="NCERT book maths 9th";abook[3]="RS agrawal maths 9th";abook[4]="All in one maths 9th";abook[5]="All in one Social Science 9th";abook[6]="All in one Science";abook[7]="Java book for beginner";abook[8]="C Language for beginner";abook[9]="Python full course for beginner"; 
    }
    // this allow user to add the book to booklist
    void addbook(){
        System.out.println("Enter the name of the book you want to add");
        String str = in.nextLine();
        abook[a+1] = str;
        a++;
        mp();
    }

    void avbook(){
        for (String hString : abook) {
            System.out.println(hString);
        }
        mp();
    }

    
    void issuebook(){
        System.out.println("Enter which book do want to issue");//asking user which book they want
        for (int j =0; j <a; j++) {
            System.out.println(j+1 +"."+abook[j]);
        }
        int y = in.nextInt();//user opinion
        System.out.println(abook[y-1] + " is issue to you till 28 days");
        System.out.println("Thankyou for using this");
        issue[i] = abook[y-1]; //adding issued book to issue list(array)
        i++;
        mp();
    }
    void showissuebook(){
        for (int j = 0; j <i; j++) {
            System.out.println(j+1+"."+issue[j]);
        }
        mp();
    }
    void bookreturn(){
        if (i==0) {
            System.out.println("You don't have issued any book");
        }
        else{
        System.out.println("Enter which book do you want to return");
        for (int j = 0; j <i; j++) {
            System.out.println(j+1+"."+issue[j]);
        }
        int r = in.nextInt();
        issue[r-1] ="";
        i--;
        System.out.println("Thankyou for reading book and enchancing your knowledge");
        System.out.println("Your book have been succesfully returned to library");
        }
    mp();
    }

    void mp(){
    System.out.println("Enter your choice");
    System.out.println(" 1. issue book"+"\n"+"2.return book"+"\n"+"3. show available book"+"\n"+"4. show issued book"+"\n"+"5. add book"+"\n"+"6. Intro"+"\n"+"7. exit");
    int q = in.nextInt();
    if(q==1){
        issuebook();
    }
    else if(q==2){
        bookreturn();
    }
    else if(q==3){
        avbook();
    }
    else if(q==4){
        showissuebook();
    }
    else if(q==5){
        addbook();
    }
    else if(q==6){
    intro();        
    }
    else if(q==7){
        return;
    }
    else{
        System.out.println("Wrong decision");
    }

}
}
public class lib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        library lib = new library();
        lib.mp();
        
    }
}
