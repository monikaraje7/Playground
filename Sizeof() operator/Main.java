#include<iostream>
using namespace std;
int main()
{
  int m,n,o,p;
  char a='A';
  m=sizeof(a);
  int b=1;
  n=sizeof(b);
  float c=4.5;
  o=sizeof(c);
  double d=4.95;
  p=sizeof(d);
  cout<<m<<"\n"<<n<<"\n"<<o<<"\n"<<p;
}