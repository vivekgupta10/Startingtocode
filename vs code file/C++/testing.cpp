#include <iostream>
#include <math.h>
using namespace std;

int main(){

    cout<<"Pythagorus theorum"<<endl;
    cout<<"Enter the first side (in cm)"<<endl; float a = 0; cin>>a;
    cout<<"Enter the second side (in cm)"<<endl; float b = 0; cin>>b;

    float c = sqrt(a*a+b*b);
    cout<<"Third side is "<<c<<endl;


    return 0;
}