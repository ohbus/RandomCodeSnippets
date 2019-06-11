t = int(input())
ls= []

def sc(lt):
	sum=lt[0]+lt[1]
	sum=sum//lt[2]
	mod=sum%2
	if mod==0:
		print("CHEF")
	else:
		print("COOK")

for _ in range(t):
	ls.append(list(map(int, input().rstrip().split())))

for i in range(t):
	sc(ls[i])