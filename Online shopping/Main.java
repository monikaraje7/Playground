#include<iostream>
using namespace std;
int main()
{
  int fs,fd,fsc,ss,sd,ssc,as,ad,asc,f,s,a;
  cin>>fs>>fd>>fsc>>ss>>sd>>ssc>>as>>ad>>asc;
  f=fs-((fs*fd)/100)+fsc;
  cout<<"In Flipkart Rs."<<f;
  s=ss-((ss*sd)/100)+ssc;
  cout<<"\nIn Snapdeal Rs."<<s;
  a=as-((as*ad)/100)+asc;
  cout<<"\nIn Amazon Rs."<<a;
  if(f<=s && f<=a )
    cout<<"\nHe will prefer Flipkart";
  else if(s<=f && s<=a)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
}