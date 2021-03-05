
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=0,t,div,sub;
        t=input.nextInt();
        while(i<t)
        {
            int j=0;
            int n=input.nextInt();
            int x=input.nextInt();
            int[] num1=new int[n];
           
            
            while(j<n)
            {
                num1[j]=j;
                j++;
            }
            div=n/2;
            sub=n-div;
            int[] num2=new int[div];
            int[] num3=new int[sub];
            int[] num4=new int[sub]; 
            int k=0;
            while(k<div)
            {
                num2[k]=num1[k];
                k++;
                
                
            }
            int p=0;
            while(p<sub)
            {
                num3[p]=num1[k];
                k++;
                p++; 
            }
            int q=sub-1;
            p=0;
            while(q>=0)
            {
                num4[p]=num3[q];
                q--;
                p++;
            }
            
            j=0;
            q=0;
            k=0;
            int[] res=new int[n];
            while(j<n)
            {
               if(j%2==0)
               {
                   res[j]=num4[k];
                   k++;
               }
               if(j%2!=0)
               {
                   res[j]=num2[q];
                   q++;
               }
               j++;
            }
            
            j=0;
            while(j<n)
            {
                if(x==res[j])
                {
                    System.out.println(j);
                }
                j++;
            }
          
            i++;
        }
    }
    
}
