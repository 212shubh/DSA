//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int count[] = new int[26];
        StringBuilder sb = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        
        for(int i=0;i<A.length();i++)
        {
            char ch = A.charAt(i);
            int val = ch-'a';
            count[val]++;
            
            if(count[val]<=1)
              q.offer(ch);
            else
              q.remove(ch);
              
            if(q.isEmpty())
              sb.append('#');
            else
            sb.append(q.peek());
        }
        return sb.toString();
     }
}