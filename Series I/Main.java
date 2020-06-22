#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i,t;
  float m;
  cin>>n;
  t=n;
  m=0.5;
  cout<<m;
  while(n>1)
  {
    for(i=0;i<=t-2;i++)
    {
       m=m+pow(3,i);
       cout<<" "<<m;
       n--;
     }
    
  }
}