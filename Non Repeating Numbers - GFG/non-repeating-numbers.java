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
    public int[] singleNumber(int[] arr)
    {
        // Code here
        int n = arr.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
               map.put(arr[i],1);
            else{
                int a = map.get(arr[i]);
                map.put(arr[i],a+1);
            }   
        }
        ArrayList<Integer>al = new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            if(e.getValue()==1)
              al.add(e.getKey());
               
        }
        Collections.sort(al);
        int ans [] = new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            ans[i] = al.get(i);
        }
        return ans;
    }
}