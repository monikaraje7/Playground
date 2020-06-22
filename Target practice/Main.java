#include<iostream>
using namespace std;
int main()
{
  int target,sum=0,score,attempt=0;
  cin>>target;
  while(sum<target)
  {
    cin>>score;
    sum=sum+score;
    attempt++;
  }
  cout<<"The number of turns is "<<attempt;
  
}