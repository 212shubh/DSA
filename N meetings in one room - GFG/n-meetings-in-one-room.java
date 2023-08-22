//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    static class pair{
        int a=0,b=0;
        pair(int a,int b)
        {
            this.a = a;
            this.b =b;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<pair> al = new ArrayList<>();
        //add elements to the pair arraylist
        for(int i=0;i<n;i++)
        {
            al.add(new pair(start[i],end[i]));
        }
        //sort the pair on the basis of the second elements(end points)
        Collections.sort(al,(first,second)->(first.b - second.b));//using lamda expression
        
        pair p = al.get(0);
        int ep  = p.b;//store first end point in ep
        int count =1;
        for(int i=1;i<n;i++)
        {
           pair p1 = al.get(i);
           if(p1.a<=ep)
             continue;
            else
            {
                count++;
                ep = p1.b;
            }
        }
        
        return count;
        
    }
}
