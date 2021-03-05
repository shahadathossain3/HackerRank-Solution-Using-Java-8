import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=0;
        long max=0,min=0,c=0;
        long[] array=new long[5];
        long[] sum=new long[5];
        while(i<5)
        {
            array[i]=input.nextLong();
            c+=array[i];
            i++;
        }
        i=0;
        while(i<5)
        {
            sum[i]=c-array[i];
            i++;
        }
        i=0;
        max=sum[i];
        min=sum[i];
        while(i<5)
        {
            if(sum[i]>max)
            {
                max=sum[i];
            }
            if(sum[i]<min)
            {
                min=sum[i];
            }
            i++;
        }
        System.out.println(min+" "+max);
        
    }
    
    
}
