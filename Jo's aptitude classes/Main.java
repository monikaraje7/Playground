#include <iostream>
using namespace std;

int main() 
{
   int m,n,o,a,small,gcd;
   cin>>m>>n>>o>>a;
   if(m<n && m<o)
     small=m;
   else if(n<m && n<o)
     small=n;
   else
     small=o;
  while(small>=0)
  {
    if(m%small==0 && n%small==0 && o%small==0)
    {
      gcd=small;
      break;
    }
    small--;
  }
  if(gcd==a)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
    return 0;
}