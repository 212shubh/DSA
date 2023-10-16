//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int start=0;
        int end=str.length()-1;
        char ch[] = str.toCharArray();
        while(start<end)
        {
            char temp = ch[start];
             ch[start]= ch[end];
             ch[end] = temp; 
            start++;
            end--;
        }
        String ans = new String(ch);
        return ans;
        
    }
}