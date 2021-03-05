import java.util.Scanner;
import java.lang.Math;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long t=input.nextLong();
        while(t-->0)
        {
            long n=input.nextLong();
            long i=1;
            int c=0;
            while(i<=Math.sqrt(n))
            {
                if(n%i==0)
                {
                    if(i%2==0)
                    {
                        c++;
                    }
                    if((n/i)%2==0)
                    {
                        c++;
                    }
                }
                i++;
            }
            if((n%2==0) && (Math.pow((int)(Math.sqrt(n)),2)==n))
            {
                c--;
            }
            System.out.println(c);
        }
    }   
}
