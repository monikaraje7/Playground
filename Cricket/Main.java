#include<iostream>
#include<bits/stdc++.h>  
using namespace std;
int main()
{
  int tb,tr,cr,cb,t,p;
  float t6,c6,crr,trr;
  cin>>tb>>tr>>cr>>cb;
  t6=tb/6;
  t=cb/6;
  p=cb%6;
  c6= ((float)t+ (float)p/10);
  crr=cr/c6;
  trr=tr/t6;
  cout<<t6<<"\n"<<fixed << setprecision(1) <<c6<<"\n"<<crr<<"\n"<<trr;
   if(crr>trr)
       cout<<"\nEligible to Win";
  else
    cout<<"\nNot Eligible to Win";
   return 0;
}