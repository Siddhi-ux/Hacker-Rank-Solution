import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



 
class Solution {
 
    
    static int maxCrossingSum(int arr[], int l, int m,
                              int h)
    {
      
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }
 
       
        sum = 0;
        int right_sum = Integer.MIN_VALUE;
        for (int i = m; i <= h; i++) {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }
 
      
        return Math.max(left_sum + right_sum - arr[m],
                        Math.max(left_sum, right_sum));
    }
 
   
    static int maxSubArraySum(int arr[], int l, int h)
    {
          
          if (l > h)
              return Integer.MIN_VALUE;
       
        if (l == h)
            return arr[l];
 
        
        int m = (l + h) / 2;
 
        
        return Math.max(
            Math.max(maxSubArraySum(arr, l, m-1),
                     maxSubArraySum(arr, m + 1, h)),
            maxCrossingSum(arr, l, m, h));
    }
 
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max_sum = maxSubArraySum(arr, 0, n - 1);
 
        System.out.println(max_sum);
    }
} 
