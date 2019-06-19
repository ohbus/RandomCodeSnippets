#include<bits/stdc++.h>
#define ll unsigned long long int
using namespace std;

ll sum(ll n)  {
  ll sum=0;
  while(n)  {
    sum+=n%10; 
    n/=10;
  }
  return sum;
}

int main()  {
  ll test=1,i,j,k,N;
  cin>>test;
  while(test--) {
    cin>>N;
    ll temp = 10 - (sum(N)%10);
    
    if(sum(N)%10==0)
      temp=0;

    ll ans= N*10 + temp;
    cout<<ans<<endl;
  }
  return 0;
}
