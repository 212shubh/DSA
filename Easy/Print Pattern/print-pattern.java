//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public List<Integer> pattern(int N){
        // code here
        int n = N;
        ArrayList<Integer>al = new ArrayList<>();
        
        al.add(n);
        if(n<=0)
          return al;
        n = n-5;
        int flag=0;
        while(n!=N)
        {
            if(n<=0)
                flag=1;
            if(flag==1)
             {
                 al.add(n);
                 n+=5;
             }
             else{
                 al.add(n);
                 n-=5;
             }
             
        }
        al.add(n);
        return al;
    }
}