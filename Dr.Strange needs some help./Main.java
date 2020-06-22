#include<iostream>
#include<math.h>
using namespace std;
int check()
{
  int x,y,req;
  cin>>x>>y>>req;
  int p=pow(x,y);
  if(p>=req)
    return true;
  else
    return false;
}
int main()
{
  if(check()==1)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
    
}