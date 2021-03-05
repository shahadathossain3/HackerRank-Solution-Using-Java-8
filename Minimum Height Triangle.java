
import java.util.Scanner;
import java.math.*;
public class Solution {

  
    public static void main(String[] args) {
       
       double b,h,a;
        Scanner input=new Scanner(System.in);
        b=input.nextDouble();
        
            a=input.nextDouble();
            h=(2*a)/b;
            System.out.println((int)(Math.ceil(h)));
        
        input.close();
    }
    
}
