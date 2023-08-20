import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
   static void swap(int[] A, int first, int second) {
       int temp = A[first];
       A[first] = A[second];
       A[second] = temp;
   }
   static void sortTheArray (int[] A) {
       int low = 0, mid = 0, high = A.length - 1;
       while(mid <= high) {
           if((A[mid]) == 0) {
               swap(A, low, mid);
               low++;
               mid++;
           } else if(A[mid] == 1) {
               mid++;
           } else {
               swap(A, mid, high);
               high--;
           }
       }
   }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        sortTheArray(arr);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
    }
}
