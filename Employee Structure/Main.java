#include<iostream>
#include<cstring>
using namespace std;
struct employee
{
  char name[50];
  char d[50];
  int id,age,sal;
}e;
int main()
{
    cout<<"Enter name:";
    cin>>e.name;
    cout<<"\nEnter ID:";
    cin>>e.id;
    cout<<"\nEnter age:";
    cin>>e.age;
    cout<<"\nEnter designation:";
    cin>>e.d;
    cout<<"\nEnter Salary:";
    cin>>e.sal;
    cout<<"\nEmployee Details";
      cout<<"\nName of the Employee : "<<e.name;
      cout<<"\nID of the Employee : "<<e.id;
      cout<<"\nAge of the Employee : "<<e.age;
      cout<<"\nDesignation of the Employee : "<<e.d;
      cout<<"\nSalary of the Employee : "<<e.sal;
  return 0;
}