import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int[] array=new int[n];
       int i=0;
       int sum=0;
       while(i<n)
       {
           array[i]=input.nextInt();
           sum+=array[i];
           i++;
       }
       System.out.println(sum);
       
    }
    
}
