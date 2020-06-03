# Your task is to complete this function

# return the minimum number of swaps required to sort the arra
def minSwaps(A, N):
    # Code here
    pos=[*enumerate(A)]
    pos.sort(key=lambda iter:iter[1])
    vis = {k:False for k in range(n)} 
    ans = 0
    for i in range(n): 
        if vis[i] or pos[i][0] == i: 
            continue
        cycle_size = 0
        j = i 
        while not vis[j]: 
            vis[j] = True
            j = pos[j][0] 
            cycle_size += 1
              
        # update answer by adding 
        # current cycle 
        if cycle_size > 0: 
            ans += (cycle_size - 1) 
    return ans






#{ 
#  Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        print(minSwaps(arr, n))

# } Driver Code Ends
