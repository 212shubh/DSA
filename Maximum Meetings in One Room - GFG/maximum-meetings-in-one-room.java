//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
   static class pair{
        int a=0,b=0,c=0;
        pair(int a,int b,int c)
        {
            this.a =a;
            this.b=b;
            this.c=c;
        }
    }
    public static ArrayList<Integer> maxMeetings(int n, int[] start, int[] end) {
        // code here
        ArrayList<pair> al = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(new pair(start[i],end[i],(i+1)));
        }
        Collections.sort(al,(first,second)->(first.b - second.b));
        
        pair p1 = al.get(0);
        int ep = p1.b;
       // System.out.println("endpoint= "+ep);
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(p1.c);
       for(int i=1;i<n;i++)
       {
           pair p = al.get(i);
           //System.out.println(p.a+","+p.b+","+p.c);
           if(p.a<=ep)
           {
               continue;
           }
           else if(p.a>ep)
           {
               ans.add(p.c);
               ep = p.b;
           }
       }
       
       //ans.add(1);
       Collections.sort(ans);
       return ans;
    }
}
        
