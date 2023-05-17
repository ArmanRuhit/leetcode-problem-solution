//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> factorials = new ArrayList<>();
        factorials.add((long)1);
        for(int i = 2; i<=N; i++){
            if(factorials.get(i-2)*(long)(i)>N){
                break;
            }else{
                factorials.add(factorials.get(i-2)*(long)(i));    
            }
            
        }
        return factorials;
    }
}