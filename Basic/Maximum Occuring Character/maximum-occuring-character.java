//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        TreeMap<Character,Integer> m = new TreeMap<>();
        
        for(int i=0;i<line.length();i++)
        {
            if(m.containsKey(line.charAt(i)))
            {
                int a = m.get(line.charAt(i));
                m.put(line.charAt(i),a+1);
            }
            else
              m.put(line.charAt(i),1);
        }
        int max = Integer.MIN_VALUE;
        char ch='1' ;
        
        for(Map.Entry<Character, Integer> e: m.entrySet())
        {
            if(e.getValue()>max)
            {
              max = e.getValue();
              ch = e.getKey();
            }
        }
        return ch;
        
        
        
    }
    
}