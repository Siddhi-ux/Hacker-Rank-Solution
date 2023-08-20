import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int median =nums[n/2];
        long moves =0;
        for(int num :nums){
            moves+=Math.abs(num-median);
        }
        System.out.println(moves);
    }
}
