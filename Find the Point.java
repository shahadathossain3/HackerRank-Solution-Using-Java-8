import java.util.Scanner;
public class Solution {

  
    public static void main(String[] args) {
      
        int px,py,qx,qy,rx,ry,n;
        
        Scanner input=new Scanner(System.in);
        
        n=input.nextInt();
        
        while(n-->0)
        {
            px=input.nextInt();
            py=input.nextInt();
            qx=input.nextInt();
            qy=input.nextInt();
            
            rx=2*qx-px;
            ry=2*qy-py;
            System.out.print(rx+" "+ry);
            System.out.println();
        }
        input.close();
        
        
    }
    
}
