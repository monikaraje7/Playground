#include<iostream>
using namespace std;
int main()
{
  int n,k,i;
  cin>>n;
  k=6;
  for(i=0;i<n;i++)
  {
    k=k+(5*i);
    cout<<k<<" ";
  }
}