#include <iostream>
#include <bits/stdc++.h>

using namespace std;

long long t, n, k, d, last, first, N, ans;

typedef long long int ll; 

ll mulmod(ll a, ll b) { 
    ll mod=1000000007;
    ll res = 0; 
    while (b > 0)  {
        if (b % 2 == 1)
            res = (res + a);
        res%=mod;
        a = (a * 2);
        a%=mod;
        b /= 2; 
    } 
    res%=mod;
    return res; 
} 

int main()  {
    int t;
    cin>>t;
    while(t--){
        cin>>n>>k;
        d=n-1;
        last=k-1;
        first=last%d;
        N=(last-first)/d + 1;
        ll z=last+first;
        if(N%2==0)
            N/=2;
        else
            z/=2;
        ans= mulmod(N,(z));
        cout<<ans%1000000007<<endl;
    }
    return 0;
}