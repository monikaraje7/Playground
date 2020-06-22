#include<iostream>
using namespace std;
int main()
{
  int n;
  float ht,htt;
  cin>>n>>ht;
  if(n==2)
  {
    htt=ht+((ht*50)/100);
    cout<<htt;
  }
  else if(n==3)
  {
    htt=2*ht;
    cout<<htt;
  }
  else
    cout<<"Number of items is more";
}