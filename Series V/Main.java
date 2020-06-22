#include<iostream>
using namespace std;
int main()
{
  int n,i,m,k;
  cin>>n;
  m=11;
  for(i=0;i<n;i++)
    {
      k=m*m;
      cout<<k<<" ";
      m=m+4;
    }
}