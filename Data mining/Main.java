#include<iostream>
using namespace std;
int main()
{
  int n,r,even=0,odd=0;
  cin>>n;
  while(n>0)
  {
    r=n%10;
    if(r%2==0)
       even=even+r;
    else
      odd=odd+r;
    n=n/10;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
}
      
