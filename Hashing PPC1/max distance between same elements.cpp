// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

int maxDistance(int arr[], int n);

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int arr[n];
        for(int i=0; i<n; i++)
            cin>>arr[i];
        cout<<maxDistance(arr,n)<<endl;
    }
    return 0;
}// } Driver Code Ends


// your task is to complete this function
int maxDistance(int arr[], int n)
{
  unordered_map<int,pair<int,int>> um;
  int i;
  int max1=0;
  for(i=0;i<n;i++)
  {
      if(um[arr[i]].first)
      {
      um[arr[i]].second=i+1;
      max1=max(max1,um[arr[i]].second-um[arr[i]].first);
      }
      
      else
      {
          um[arr[i]].first=i+1;
      }
  }
  return max1;
 
}
