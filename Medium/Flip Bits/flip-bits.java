//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int arr[], int n) {
        // Your code goes here
        //replace 1 with -1 and 0 with +1 because when we flip zero to 1
        // we gain 1 and when  we flip 1 to zero we lose one 1
        //also count number of ones in original array and add it to max
        //subarray sum obtained by kadane
        int count=0;
        //if there are only ones then return arraysize as count of ones
        boolean flag =true;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
              arr[i] =1;
              flag =false;
            }  
            else
            {
               arr[i]=-1;
               count++;
            }
        }
        
        if(flag==true)
          return n;
        //apply kadane 
        int curr=0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            curr+=arr[i];
            if(curr>max)
              max = curr;
            if(curr<0)
              curr=0;
        }
        return max+count;
    }
}
