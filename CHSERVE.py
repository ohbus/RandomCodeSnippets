for i in range(0,int(input())):
    p1,p2,k=map(int,input().split())
    xe=(p1+p2)%(2*k)
    if xe in range(0,k):
        print("CHEF")
    else:
        print("COOK")

#Problem Statement : https://www.codechef.com/OCT18B/problems/CHSERVE