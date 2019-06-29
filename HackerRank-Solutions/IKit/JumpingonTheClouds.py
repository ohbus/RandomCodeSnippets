#NOT RUNNING ALL TEST CASE. SUGGESSTIONS ARE WELCOMED! :D
#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the jumpingOnClouds function below.
def jumpingOnClouds(n,c):
    pointer = 0
    jump = 0
    for i in range(n-2):
        if c[i+1] == 0:
            if c[i+2] == 0:
                pointer += 2
                i = pointer
                jump += 1
            else:
                pointer += 1
                i = pointer
                jump += 1
        else:
            if c[i+2] == 0:
                pointer += 2
                i = pointer
                jump += 1
            else:
                return jump
    return jump


if __name__ == '__main__':
    n = int(input())
    c = list(map(int, input().rstrip().split()))
    result = jumpingOnClouds(n,c)
    print(str(result))
