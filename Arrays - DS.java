
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int[] array=new int[n];
       int i=0;
       while(i<n)
       {
           array[i]=input.nextInt();
           i++;
       }
       int j=n-1;
       while(j>=0)
       {
           System.out.print(array[j]+" ");
           j--;
       }
    }
    
}
