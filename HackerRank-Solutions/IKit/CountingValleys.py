#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countingValleys function below.
def countingValleys(n, s):
    level = 0
    valley = 0
    for i in s:
        if level == -1 and i == 'U':
            valley += 1
            level += 1
        elif i == 'D':
            level -= 1
        else:
            level += 1
    return valley

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input())
    s = input()
    result = countingValleys(n, s)
    fptr.write(str(result) + '\n')
    fptr.close()
