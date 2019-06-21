for _ in range(0,int(input())):
    s = input()
    es=""
    os=""
    for i in range(len(s)):
        if i % 2 == 0:
            es = es + s[i]
        else:
            os = os + s[i]
    print(es,os)