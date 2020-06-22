#include<iostream>
using namespace std;
int main()
{
  int w,na,nc,t;
  cin>>w>>na>>nc;
  t=(75*na)+(30*nc);
  if(t<w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}
  