import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int i=0;
       long sum=0;
       while(i<n)
       {
          
           long a=input.nextLong();
           sum+=a;
           i++;
       }
       
      System.out.println(sum);
       
    }
    
}
