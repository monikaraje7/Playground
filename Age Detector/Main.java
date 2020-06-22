#include<iostream>
using namespace std;
int main()
{
  int by,cy,a;
  cin>>by>>cy;
  if(by>cy)
  {
     a=(100-by)+cy;
     cout<<a;
  }
  else
  {
    a=cy-by;
    cout<<a;
  }
}