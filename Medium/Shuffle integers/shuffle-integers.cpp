//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
	
	
	
	public:
	void shuffleArray(int arr[],int n)
	{
	    // Your code goes here
	     long ans[n];
        

        int j=0;
        int k=n/2;
       for(int i=0;i<n;i++)
       {
           if(i%2==0)
           {
           
               ans[i] = arr[j];
               j++;
            }
           else{
        
                 ans[i] = arr[k];
                 k++;
           }
       }
        
       for(int i=0;i<n;i++)
       {
           arr[i] = ans[i];
       }
        
	}
		 

};

//{ Driver Code Starts.


int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
    	int n;
	    cin>>n;
	    int a[n] ;
	    for(int i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }


       

        Solution ob;
        ob.shuffleArray(a, n);

		for (int i = 0; i < n; i++) 
			cout << a[i] << " ";
    
	
        
	    cout << "\n";
	     
    }
    return 0;
}
// } Driver Code Ends