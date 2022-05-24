import java.io.*;
import java.util.*;
class Sum
{
   public static void main(String args[])
    { 
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=s.nextInt();
      int r,rev=0,num,sum=0;
      num=n;
      while(n>0 )
       {
        r=n%10;
        sum=sum+r;
       
       n=n/10;
      }
 
      System.out.println("Sum="+sum);
            
            }  
}                                                   