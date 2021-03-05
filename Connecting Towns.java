import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        
        int n,town,route;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int i=0;
        while(i<n)
        {
            int result=1;
            town=input.nextInt();
            int j=0;
            //int route[]=new int[town-1];
            while(j<town-1)
            {
                route=input.nextInt();
                result=(result*route)%1234567;
                j++;
            }
            System.out.println(result);
            i++;
        }
    }
    
}
