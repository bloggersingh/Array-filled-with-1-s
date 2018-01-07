package test;

public class t 	{
		    
		     static int countIterations(int arr[], int n)
		    {
		        boolean oneFound = false;
		        int res = 0;
		         
		       
		        for (int i=0; i<n; )
		        {
		            if (arr[i] == 1)
		              oneFound = true;
		      
		            
		            while (i<n && arr[i]==1)
		                i++;
		      
		            
		            int count_zero = 0;
		            while (i<n && arr[i]==0)
		            {
		                count_zero++;
		                i++;
		            }
		      
		          
		            if (oneFound == false && i == n)
		                return -1;
		      
		            // Condition to check if Case 1 satisfies:
		            int curr_count;
		            if (i < n && oneFound == true)
		            {
		                // If count_zero is even
		                if ((count_zero & 1) == 0)
		                    curr_count = count_zero/2;
		      
		                // If count_zero is odd
		                else
		                    curr_count = (count_zero+1)/2;
		      
		                // Reset count_zero
		                count_zero = 0;
		            }
		      
		            // Case 2
		            else
		            {
		                curr_count = count_zero;
		                count_zero = 0;
		            }
		      
		            // Update res
		            res = Math.max(res, curr_count);
		        }
		      
		        return res;
		    }
		     
		    
		    public static void main(String[] args) 
		    {
		        int arr[] = {1, 0, 1, 0, 1, 0, 1};
		      
		        
		         
		        System.out.println(countIterations(arr, arr.length));
		         
		    }
		}
	

