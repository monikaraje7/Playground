#include <iostream>
using namespace std;
void swap(int &a1,int &b1)
{
  int temp;
  temp=a1;
  a1=b1;
  b1=temp;
}
int main() 
{
   int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b;
  swap(a,b);
  cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
  return 0;
}