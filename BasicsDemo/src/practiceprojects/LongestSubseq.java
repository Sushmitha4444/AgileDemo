package practiceprojects;
import java.util.Scanner;
public class LongestSubseq {


	    public int[] lis(int[] X)
	    {        
	        int n = X.length - 1;
	        int[] Y = new int[n + 1];  
	        int[] Z = new int[n + 1]; 
	        int L = 0;
	 
	        for (int i = 1; i < n + 1; i++)
	        {
	            int j = 0;
	 
	            
	            for (int pos = L ; pos >= 1; pos--)
	            {
	                if (X[Y[pos]] < X[i])
	                {
	                    j = pos;
	                    break;
	                }
	            }            
	            Z[i] = Y[j];
	            if (j == L || X[i] < X[Y[j + 1]])
	            {
	                Y[j + 1] = i;
	                L = Math.max(L,j + 1);
	            }
	        }
	 
	        /** backtrack **/
	 
	        int[] result = new int[L];
	        int pos = Y[L];
	        for (int i = L - 1; i >= 0; i--)
	        {
	            result[i] = X[pos];
	            pos = Z[pos];
	        }
	        return result;             
	    }
	 
	    /** Main Function **/
	    public static void main(String[] args) 
	    {    
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter number of elements");
	        int n = scan.nextInt();
	        int[] arr = new int[n + 1];
	        System.out.println("\nEnter "+ n +" elements");
	        for (int i = 1; i <= n; i++)
	            arr[i] = scan.nextInt();
	 
	        LongestSubseq obj = new LongestSubseq(); 
	        int[] numbers = obj.lis(arr);       
	 
	        /** print result **/ 
	 
	        System.out.print("\nLongest Increasing Subsequence : ");
	        for (int i = 0; i < numbers.length; i++)
	            System.out.print(numbers[i] +" ");
	        System.out.println();
	    }
	

}
