import java.util.Scanner;
import java.lang.Math;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=0;
        int n=input.nextInt();
        int[][] array=new int[n][n];
        int sum1=0,sum2=0,sub=0;
        while(i<n)
        {
            int j=0;
            while(j<n)
            {
                array[i][j]=input.nextInt();
                j++;
            }
            i++; 
        }
        
        i=0;
        while(i<n)
        {
            int j=0;
            while(j<n)
            {
                if(i==j)
                {
                    sum1+=array[i][j];
                }  
                j++;
            }
           sum2+=array[i][n-1-i];
            i++; 
        }
        sub=sum1-sum2;
        System.out.println(Math.abs(sub));
    }
    
}
