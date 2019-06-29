#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    keyl = list(dict.fromkeys(ar))
    cntl = []
    for i in keyl:
        count = 0
        for j in ar:
            if i == j:
                count+=1
        cntl.append(count)
    ret = 0
    for i in cntl:
        ret = ret + i//2
    return ret

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input())
    ar = list(map(int, input().rstrip().split()))
    result = sockMerchant(n, ar)
    fptr.write(str(result) + '\n')
    fptr.close()
