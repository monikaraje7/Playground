#include<iostream>
using namespace std;
int fibonacci(int n)
{
  if (n == 0)
    return 0;
  else if (n == 1)
    return 1;
  else
    return (fibonacci(n - 1)+fibonacci(n - 2));
}
int main ()
{
  int n, r;
  cin>>n;
  r=fibonacci(n - 1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<r;
  return 0;
}
