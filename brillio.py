#!/usr/bin/python3
'''
    Total number of lines or rows become the side
    of the square.
    
    Any value beyond the total number of rows
    is considered a candy to be moved.
    
    if total lines are 3, then the side of the square is 3.
    
                                                             ()()
                                         ===>        
                     () ()                             
'''
def minMoves(n):
    moves = 0
    # number of rows n
    for i in range(0, n+1):
        # number of columns 
        for j in range(0, 2*i - 1):
            #print(" ",end="")
            if (j+1 > n ):
                moves += 1
        #print("r")
    print(f'Minimum Moves: {moves}')

def main():
    totLines = int(input("Enter total number of lines of candies in the triangle: "))
    minMoves(totLines)

if __name__ == "__main__": main()