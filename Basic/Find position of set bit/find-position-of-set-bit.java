//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int n) {
        // code here
         int count=0;
         int index=0;
         int rem=0;
         int ans=-1;
        while(n!=0)
        {
          index++;
          rem = n%2;
         
          if(rem==1)
            count++;
        if(count==1)
          ans = index;
       else if(count>1)
           return -1;
           
        n/=2;    
        }
        return ans;
    }
};