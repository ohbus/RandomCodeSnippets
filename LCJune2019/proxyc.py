#not accepted as well xD HELP needed

import math
t = int(input())
while t > 0:
    t-=1
    n = int(input())
    s = input()
    qt = math.ceil(n*3/4.0)
    pr = int(0)
    ps = int(0)
    for d in s:
        if d == 'P': pr+=1
    for i in range(2, n - 2):
        if s[i] == 'A':
            if (s[i-1] == 'P' or s[i-2] == 'P') and ( s[i+1] == 'P' or s[i+2] == 'P'):
                ps+=1
    if qt - pr <= ps:
        print(str(qt-pr))
    else:
        print("-1")