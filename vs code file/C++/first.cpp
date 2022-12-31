#include <iostream>
using namespace std;

void calculator(int a ,int b ,int c){
    int sum;
    if(c==1){ // This if else ladder will help us to print the expected output
        sum = a+b;
        cout<<sum;
    
    }
    else if(c==2){
        sum = a-b;
        cout<<sum;
    }
    else if(c==3){
        sum = a*b;
        cout<<sum;
    }
    else if(c==4){
        sum = a/b;
        cout<<sum;
    }else{
        cout<<"Wrong decision";
        sum = 53;
    }
    cout<<"\n Enter the operation";
    cin>>c;
    cout<<"\nEnter another number";
    cin>>b;
    calculator(sum,b,c);
       

}

int main(){

    int c,a,b;// Here we create the variables need for this calculator

    /* This line will give user a manual of option to perform */cout<<"Enter which operation you have to perform\n"<<"1. Addition\n"<<"2.Subraction\n"<<"3.Multiplication\n"<<"4.Division\n";

    cin>>c;// here we Take the user choice of operation

    cout<<"Enter the fist number\n";// Here we ask the first number
    cin>>a;// Here we take first number

    cout<<"Enter the second number\n";// Here we ask second number
    cin>>b;// Here we take second number
    calculator(a,b,c) ;
    
    return 0;
}