import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
       int a=sc.nextInt();
        int ar[] =new int[a];
        for(int i=0;i<a;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(maximumProfit(ar));
        }
    static int maximumProfit(int ar[])
    {
int a=ar.length;
    int best =ar[0],mprofit =0;
        for(int i=1;i<a;i++){
              if(best>ar[i]){
              best =ar[i];
              }
            else if(ar[i]-best>mprofit){
                mprofit=ar[i]-best;
            }
        }
        return mprofit;
        }
    }
