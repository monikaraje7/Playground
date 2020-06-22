#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,y,d,r;
  cin>>x>>y;
  r=(((x-3)*(x-3))+((y-4)*(y-4)));
  d=sqrt(r);
  cout<<d;
}