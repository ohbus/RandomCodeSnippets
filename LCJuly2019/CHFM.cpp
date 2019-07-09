//DOES NOT WORK

#include <iostream>
#include <bits/stdc++.h>
#define ll unsigned long long int
using namespace std;

int main()	{
    ll T, N, i, in, s=0;
    bool equ;
    cin>>T;
    while(T-->0)	{
    	double s = 0;
        cin>>N;
        vector <unsigned int> vec;
        for(i = 0 ; i<N ; i++)	{
            cin>>in;
            vec.push_back(in);
            s += in;
        }
	    equ = equal(vec.begin()+1, vec.end(), vec.begin());
	    if(equ == true)
	    	cout<<"1"<<endl;
	    else if(binary_search(vec.begin(),vec.end(), s/N) == false)
	    	cout<<"Impossible"<<endl;
	    else
	        cout<<int(s/N)<<endl;
    }
    return 0;
}