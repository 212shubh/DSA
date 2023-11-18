//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            x =x^nums[i];
        }
        
        x= x & ~(x-1);// for finding the right most bit
        
        //for seprating the number take & with the numbers
        // for 001 set1 and for 000 set2
        int set1=0,set2=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]&x)!=0)
            {
                set1 = set1^nums[i];
            }
            else
              set2 = set2^nums[i];
            
        }
        int ans[] = new int[2];
        if(set1>set2)
        {
          ans[1]= set1;
          ans[0]=set2;
        }
        else
        {
            ans[0] = set1;
            ans[1] = set2;
        }
        return ans;
          
          
        
    }
}