#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,dollar,r;
  cin>>d1>>c1>>d2>>c2;
  dollar=d1+d2;
  if((c1+c2)>100)
  {
    r=(c1+c2)%100;
    dollar=dollar+1;
  }
  else
  {
    r=c1+c2;
  }
  cout<<dollar<<"\n"<<r;
}