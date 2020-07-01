# your task is to complete this function
# your function should return the length of the longest subsequence
def findLongestConseqSubseq(arr, n):
    s = set() 
    ans = 0
    for ele in arr: 
        s.add(ele) 
    for i in range(n): 
        if (arr[i]-1) not in s: 
            j = arr[i] 
            while(j in s): 
                j+= 1
            ans = max(ans, j-arr[i]) 
    return ans 


#{ 
#  Driver Code Starts
# Driver function 
if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        print(findLongestConseqSubseq(arr, n[0]))
# Contributed by: Harshit Sidhwa
# } Driver Code Ends
