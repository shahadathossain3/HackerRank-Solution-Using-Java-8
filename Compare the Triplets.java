import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       //int n=input.nextInt();
       int[] a=new int[3];
       int[] b=new int[3];
       int i=0,c=0,d=0;
       while(i<3)
       {
          
           a[i]=input.nextInt();
           i++;
       }
       int j=0;
         while(j<3)
       {
          
           b[j]=input.nextInt();
           j++;
       }
      int k=0;
      while(k<3)
      {
          if(a[k]>b[k])
          {
              c++;
          }
          if(a[k]<b[k])
          {
              d++;
          }
          k++;
      }
      System.out.print(c+" "+d);
       
    }
    
}
