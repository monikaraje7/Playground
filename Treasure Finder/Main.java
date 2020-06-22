#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  
  // to find the treasure box
  if((a<b && c>b) || (c<b && a>b))
    cout<<"The treasure is in box which has number "<<b;
  else if((b<a && c>a) || (c<a && b>a))
    cout<<"The treasure is in box which has number "<<a;
  else
    cout<<"The treasure is in box which has number "<<c;
  
  // to find the code
  if(b%a==0 && c%a==0)
    cout<<"\nThe code to open the box is "<<a;
  else if(a%b==0 && c%b==0)
    cout<<"\nThe code to open the box is "<<b;
  else if(b%c==0 && a%c==0)
    cout<<"\nThe code to open the box is "<<c;
  else
    cout<<"\nThe code to open the box is "<<1;
  
  
}