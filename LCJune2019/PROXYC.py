for _ in range(0,int(input())):
	
	n = int(input())
	s = input()
	
	prx=0
	prxper=0.0

	for i in range(n):
		if s[i]=='P':
			prx+=1

	prxper = (prx/n)*100

	if prxper >= 75.0:
		print(0)
		sys.exit()

	prx=0

	for i in range(2, n-2):
		if s[i] == 'A':
			if s[i-1] == s[i-2] == 'P':
				prx+=1

	print(prx)