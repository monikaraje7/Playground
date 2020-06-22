#include<iostream>
using namespace std;
int main()
{
  int n,i,a[20],value;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  value=a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]>value)
    {
      value=a[i];
    }
  }
  cout<<value;
  
}