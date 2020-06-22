#include<iostream>
int main()
{
   int n,count=0;
  std::cin>>n;
  do
  {
    count=count+1;
    n=n/10;
  }
  while(n>0);
    std::cout<<count;
    
}