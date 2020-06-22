#include<iostream>
using namespace std;
int main()
{
  int n,a[20],r,i,flag=0;
  cin>>n;
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>r;
  for(i=0;i<n;i++)
  {
    if(a[i]==r)
      flag=1;
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}