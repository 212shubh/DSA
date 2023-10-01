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
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer>al = new ArrayList<>();
        //corner case when there is only one row
        
                //first row
                for(int i=0;i<c;i++)
                al.add(matrix[0][i]);
                //last column
                if(r>1)
                for(int i=1;i<r;i++)
                  al.add(matrix[i][c-1]);
                //last row
                if(r>1)
                for(int i=c-2;i>=0;i--)
                  al.add(matrix[r-1][i]);
                //first column
                if(c>1)
                for(int i=r-2;i>=1;i--)
                  al.add(matrix[i][0]);
         return al;
    }
}
