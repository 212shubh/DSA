//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int mat[][], int rsize, int csize)
    {
        // code here 
        //int up [] = new int[csize];
        ArrayList<Integer>right= new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();
        ArrayList<Integer>left = new ArrayList<>();
        ArrayList<Integer> ans  = new ArrayList<>();
        
        for(int i=0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                if(i==0)
                {
                     ans.add(mat[i][j]);
                }
                else if(i>0 && j==csize-1)
                {
                   right.add(mat[i][j]);  
                }
                else if(i==rsize-1 && j<csize-1)
                {
                    bottom.add(mat[i][j]);
                }
                else if(i>0 && j==0)
                {
                    left.add(mat[i][j]);
                }
            }
        }
        
        Collections.reverse(bottom);
        Collections.reverse(left);
        
        ans.addAll(right);
        ans.addAll(bottom);
        ans.addAll(left);
        return ans;
        
    }
}
