#include <iostream>
#include <bits/stdc++.h>
using namespace std;
vector<long long> v;

long long t,n,k,x,maxi,sum,sum2,sum1,a[200000],b[200000];

int main()  {
    cin>>t;
    while(t--){
        maxi=0;
        sum=0;
        sum1=0;
        sum2=0;
        v.clear();
        cin>>n;
        for(int i=0;i<n;i++)    {
            cin>>a[i];
            sum+=a[i];
        }
        cin>>k>>x;
        for(int i=0;i<n;i++)    {
            b[i]=a[i]^x;
            v.push_back(b[i]-a[i]);
        }
        sort(v.begin(),v.end());
        reverse(v.begin(),v.end());
        if(k%2==0)  {
            for(int i=0;i<v.size();i++) {
                sum1+=v[i];
                if(i%2==1){
                    maxi=max(maxi,sum1);
                }
            }
        }
        else    {
            for(int i=0;i<n;i++)    {
                sum2+=v[i];
                maxi=max(maxi,sum2);
            }
        }
        if(n==k)    {
            long long sum3=0;
            for(int i=0;i<n;i++)    {
                sum3+=b[i];
            }
            cout<<max(sum3,sum)<<endl;
            continue;
        }
        cout<<sum+maxi<<endl;
    }
    return 0;
}
