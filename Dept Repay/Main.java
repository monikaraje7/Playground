#include<iostream>
using namespace std;
int main()
{
  double s,a,d,f;
  int p,r,n;
  cin>>p>>r>>n;
  s=(p*r*n)/100;
  cout<<s;
  a=p+s;
  cout<<"\n"<<a;
  d=s*0.02;
  cout<<"\n"<<d;
  f=p+s-d;
  cout<<"\n"<<f;
}
