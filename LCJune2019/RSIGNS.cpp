#include<bits/stdc++.h>
using namespace std;

#define MOD 1000000007

long long int fast_eo(long long int b, long long int e)  {
  if(e == 0) return 1;
  if(e == 1) return b;
  long long int sol = fast_eo(  (b*b)%MOD , e/2) % MOD;
  if(e%2 == 1) sol = (sol * b)%MOD;
  return sol;
}

int main()  {
  long long int n, t; cin >> t;
  while(t--)  {
    cin >> n;
    cout << (10LL*fast_eo(2LL, n-1))%MOD << endl;
  }
}