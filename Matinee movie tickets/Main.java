#include<iostream>
using namespace std;
int main()
{
  int a;
  float st;
  cin>>a>>st;
  if(st>=12 && st<=18)
  {
    if(a>13)
      cout<<"$5.00";
    else
      cout<<"$2.00";
  }
  else
  {
    if(a>13)
      cout<<"$8.00";
    else
      cout<<"$4.00";
  }
}