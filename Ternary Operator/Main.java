#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n;
  (n%2==0)?m=1:m=0;
    if(m==1)
      cout<<"Even";
  else
    cout<<"Odd";
}