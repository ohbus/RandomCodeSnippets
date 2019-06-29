def fibonacci(a,b,n): 
	c = 0
	count = 3
	while(count <= n):
		c = a+b
		a = b
		b = c
		count+=1
	return c

def prime(n):
	i = 2
	while(i <= n//2):
		if n % i == 0:
			return False
		i+=1
	return True

def step1(a,b):
	l = []
	for i in range(a,b+1):
		if prime(i):
			l.append(i)
	return l

def step2(lint):
	lint1 = []
	for i in range(len(lint)):
		lint1.append(abs(lint[i]))
	lstr = list(map(str,lint1))
	lstore = []
	for i in lstr:
		for j in lstr:
			if i == j:
				continue
			else:
				new = i+j
				lstore.append(new)
	lstore = list(dict.fromkeys(lstore))
	return list(map(int,lstore))

def step3(lint):
	lstore = []
	for i in lint:
		if prime(i):
			lstore.append(i)
	return lstore


#driver
if __name__ == "__main__":
	l = list(map(int,input().split()))
	n1 , n2 = l[0], l[1]
	s1 = step1(n1,n2)
	print("\n\n\nPrime Sq : ",s1," \n\nLen : ",len(s1))
	s2 = step2(s1)
	print("\n\n\nCombination : ",s2,"\n\nLen : ",len(s2))
	s3 = step3(s2)
	print("\n\n\nCombination Prime : ",s3,"\n\nLen : ",len(s3))
	mini = min(s3)
	maxi = max(s3)
	leng = len(s3)
	print("\n\n",mini,maxi,leng)
	print(fibonacci(mini,maxi,leng))



'''
l123 = step1(2,40)
print("First List ",l123)
l1234 = step2(l123)
print("Second list : ",l1234)
print(len(l1234))
l12345= step3(l1234)
print(l12345)
leng = len(l12345)
mxi = max(l12345)
mni = min(l12345)
print(leng,mni,mxi)
print(fibonacci(mni,mxi,leng))

l123 = step1(30,70)
print("\n\nNEW!!!\n",l123)
l1234 = step2(l123)
print(l1234)
print(len(l1234))
l12345= step3(l1234)
print(l12345)
leng = len(l12345)
mxi = max(l12345)
mni = min(l12345)
print(leng,mni,mxi)
print(fibonacci(mni,mxi,leng))












#driver

l = list(map(int,input().split()))
n1 , n2 = l[0], l[1]
s1 = step1(n1,n2)
s2 = step2(s1)
s3 = step3(s2)
mini = min(s3)
maxi = max(s3)
leng = len(s3)
print(fibonacci(mini,maxi,leng),end="")











'''