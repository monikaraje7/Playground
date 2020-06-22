#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp,sum=0,r,k,v;
  temp=n;
  if(n/1000==0)
    v=3;
  else
    v=4;
  while(n>0)
  {
    r=n%10;
    k= power(r,v);
    sum=sum+k;
    n=n/10;
  }
  if(sum==temp)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}