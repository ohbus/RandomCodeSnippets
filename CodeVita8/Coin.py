for _ in range(0,int(input())):
	def ranger(n):
		i = 1
		while(i<=n):
			j = 1
			sum = 0
			while(j<=i):
				sum = sum + j
				if sum >= n:
					return i
				j+=1
			i+=1

	n = int(input())
	print(ranger(n))