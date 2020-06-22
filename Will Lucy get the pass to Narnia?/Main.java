#include<iostream>
using namespace std;
int main()
{
  int x,y,z,m;
  cin>>x>>y>>z;
  cout<<"Enter first number : Enter second number : Menu";
  cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  switch(z)
  {
    case 1 : 
      m=x+y;
      cout<<"\n"<<m;
      break;
    case 2 : 
      m=x-y;
      cout<<"\n"<<m;
      break;
    case 3 : 
      m=x*y;
      cout<<"\n"<<m;
      break;
    case 4 : 
      m=x/y;
      cout<<"\n"<<m;
      break;
    case 5 : 
      m=x%y;
      cout<<"\n"<<m;
      break;
    default :
      cout<<"\nInvalid operation";
      break;
  }
  
  
  
}