#include<bits/stdc++.h>
using namespace std;

int main()  {
  int t; cin >> t;
  while(t--)  {
    string s;
    int size; 
    cin >> size;
    cin >> s;
    int prs = 0;
    int pos = 0;
    for(auto c: s)
      if (c == 'P')
        prs++;
    for(int i = 2; i < size - 2; i++) {
      if(s[i] == 'A' &&
        ( (s[i-1] == 'P') || (s[i-2] == 'P') )
        &&
        ( (s[i+1] == 'P') || (s[i+2] == 'P') )
      )
      pos++;
    }
    if(prs*4 >= size*3) cout << "0" << endl;
    else if( size*3 > (prs+pos)*4) cout << "-1" << endl;
    else cout << ceil(3.00*size/4.0) - prs << endl;
  }
}