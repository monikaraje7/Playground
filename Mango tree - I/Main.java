#include<iostream>
using namespace std;
int main()
{
  int r,c,t,s,f,m;
  cin>>r>>c>>t;
  for(s=1;s<=c;s++)
  {
    if(s==t)
      m=1;
  }
  for(int i=1;i<=r;i++)
  {
    s=(i*r)+1;
    if(s==t)
      m=1;
    f=i*r;
    if(s==f)
      m=1;
  }
  if(m==1)
    cout<<"Yes";
  else
    cout<<"No";
    
  }

