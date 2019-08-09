
public class newprime {
	int n=26,i,j=0;
	public void check()
	{
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				j=j+1;
			}
		}
			if(j==0)
			{
				System.out.println("n is prime");
				//break;
			}
			else
			{
				System.out.println("n is not prime");
			}
		
	}
	public static void main(String arg[])
	{
	newprime obj=new newprime();
	obj.check();
	}
	
	

}
