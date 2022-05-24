import java.util.Scanner;
class NegExp extends Exception
{
NegExp(String v)
{
super(v);
}
}
class avge
{
  public static void main(String[] args)
  {
    int n,i;
	double avg,sum=0;
    Scanner s=new Scanner(System.in);
	System.out.print("Enter the limit:");
	n=s.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
	  a[i]=s.nextInt();
	  try
	  {
	    if(a[i]>0)
		{
			sum=sum+a[i];
		}
		else
		{
			throw new NegExp("Negative number");
		}
		
	  }
		catch (NegExp e)
		{
           System.out.println(e.getMessage());
		   }
    }
	  avg=sum/n;
	  System.out.println("Average of Positive Numbers ="+avg);
	}
}