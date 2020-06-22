#include<iostream>
using namespace std;
int main()
{
  int m,n1=0,n2=1,i,n3;
  cin>>m;
  if(m==1)
    cout<<n1;
  else if(m==2)
    cout<<n2;
  else
  {
    for(i=2;i<m;++i)     
    {    
       n3=n1+n2;        
       n1=n2;    
       n2=n3;    
    }  
    cout<<n3;
  }

}