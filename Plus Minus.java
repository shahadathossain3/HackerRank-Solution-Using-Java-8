
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=0,plus=0,minus=0,zero=0;
        int n=input.nextInt();
        int[] array=new int[n];
        while(i<n)
        {
            array[i]=input.nextInt();
            if(array[i]>0)
            {
                plus++;
            }
            else if(array[i]<0)
            {
                minus++;
            }
            else
            {
                zero++;
            }
            i++;
            
        }
        
        double res1=(double)plus/n;
        double res2=(double)minus/n;
        double res3=(double)zero/n;
        
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMinimumFractionDigits(6);
        System.out.println(nf.format(res1)+"\n"+nf.format(res2)+"\n"+nf.format(res3));
       // System.out.print(res1);
    }
    
    
}
