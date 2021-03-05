import java.util.Scanner;
import java.math.*;
public class Solution {

   
    public static void main(String[] args) {
       
        int T,N,result;
        Scanner input=new Scanner(System.in);
        T=input.nextInt();
        while(T-->0)
        {
            N=input.nextInt();
            result=(N*(N-1))/2;
            System.out.println(result);
        }
        input.close();
    }
    
}
