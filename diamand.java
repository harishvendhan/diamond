import java.util.*;
import java.lang.*;
import java.net.SocketPermission;
public class diamand {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.print("enter a row :");
        int row=scan.nextInt();
        /* sss
int i,j;
for( i=1;i<=row;i++)
{   
        for(j=1;j<=row-i;j++)
       {
         System.out.print(" ");
       }
        
        for(j=1;j<=i;j++)
       {
         System.out.print(" *");
       }
  System.out.println();     
}*/
int e,f;
for( e=1;e<=row;e++)
{   
        for(f=1;f<=row-e;f++)
       {
         System.out.print(" ");
       }
        
        for(f=1;f<=e;f++)
       {
         System.out.print(" *");
       }
  System.out.println();     
}
      int c,h;
      for( c=1;c<=row;c++)
      {   
             
              
              for(h=1;h<=c;h++)
             {
               System.out.print(" ");
             }
             for(h=1;h<=row-c;h++)
             {
               System.out.print(" *");
             }
        System.out.println();     
      } 
       
    }


}