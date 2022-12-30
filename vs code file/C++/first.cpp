#include <iostream>
using namespace std;

int main(){

    int c,a,b;// Here we create the variables need for this calculator

    /* This line will give user a manual of option to perform */cout<<"Enter which operation you have to perform\n"<<"1. Addition\n"<<"2.Subraction\n"<<"3.Multiplication\n"<<"4.Division\n";

    cin>>c;// here we Take the user choice of operation

    cout<<"Enter the fist number\n";// Here we ask the first number
    cin>>a;// Here we take first number

    cout<<"Enter the second number\n";// Here we ask second number
    cin>>b;// Here we take second number

    if(c==1){ // This if else ladder will help us to print the expected output
        cout<<a+b;
    }
    else if(c==2){
        cout<<a-b;
    }
    else if(c==3){
        cout<<a*b;
    }
    else if(c==4){
        cout<<a/b;
    }else{
        cout<<"Wrong decision";
    }
    cout<<"\n";
    cin>>a;
    return 0;
}