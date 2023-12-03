#include <iostream>
using namespace std;
//Making an stuct and using an struct type
typedef/*Typedef use to define a name for this struct you can create a shorcut by which you can use this sturct rather than writing the full adress*/struct student{
    // The data you want to give to your struct type write here
    string name;
    int id;
    char rollno;
    float percentage;
}sid/*This will a shorcut or name ,this will only possible if using typedef*/;


union language{// This will create the union // you can use any name instead of any reserved name
    // Make any no of data but remember you can use any one datatype at one time
    int maths;
    int english;
    float hindi;
};
int main() {
    //This is enum
    enum hel{hello,world};
    cout<<hello<<endl;
    // THis will use to make an object using union
    union language usa;
    usa.english = 43;

    // How to set and print the value of student
    sid student1;//This will make an object using the struct
    student1.name = "Random name";//This will set the name string of student
    student1.id = 2342;//This will set the int id of the student
    student1.rollno = '23';//This will set the roll no. of the student
    student1.percentage = 95.1;//This will set the float percentage of student
    cout<<student1.percentage<<student1.name<<student1.id<<student1.rollno<<endl;//This will print all the value of the student object of sturct type
    cout<<"hello world this is me through c== and this is basci task i'll do with the main"<<endl;
    return 5;
}