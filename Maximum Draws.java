import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
     
        int T,N;
        Scanner input=new Scanner(System.in);
        T=input.nextInt();
        int i=1;
        while(i<=T)
        {
           N=input.nextInt();
           System.out.println(N+1);
           i++;
        }
    }
    
}
