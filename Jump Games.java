import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int ar[] =new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(jumpGame(ar));
    }
    static boolean jumpGame(int ar[]){
        int maximum =0;
        for(int i=0;i<ar.length;i++){
           if(i>maximum){
               return false;
} 
            maximum =Math.max(maximum,i+ar[i]);
}
        return true;
            
    }
}
