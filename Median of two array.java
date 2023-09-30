import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num1 =new int[n];
            for(int i=0;i<n;i++){
                num1[i]=sc.nextInt();
            }
        Arrays.sort(num1);
        
        int m=sc.nextInt();
        int[] num2 =new int[m];
        for(int i=0;i<m;i++){
            num2[i]=sc.nextInt();
        }
        Arrays.sort(num2);
        
        int[] merged = new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(num1[i]<num2[j]){
            merged[k++]=num1[i++];
        }else{
            merged[k++]=num2[j++];
        }
        }while(i<n){
            merged[k++]=num1[i++];
        }while(j<m){
            merged[k++]=num2[j++];
        }
        int mid =(m+n)/2;
        if((m+n)%2 == 0){
           double median = (double) (merged[mid - 1] + merged[mid]) / 2;
            System.out.println(median);
        }else{
            double median =  (double) merged[mid];
            System.out.println(median);
        }
    }
}
