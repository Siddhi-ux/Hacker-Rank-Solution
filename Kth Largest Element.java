import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
            
        }
        int k=sc.nextInt();
        PriorityQueue<Integer> minHeap = new  PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.offer(nums[i]);
        }
        for(int i=k;i<n;i++){
            if(nums[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        System.out.println(minHeap.peek());
    }
    
}




