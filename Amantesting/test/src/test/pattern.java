package test;

public class pattern 
{
	int n,i,j;
	public void cal()
	{
	for(i=0;i<=4;i++)
	{
		for(j=4-i;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
	}
	for(int i=4-1;i>=1;i--)
	{
		for(j=4-1;j>=1;j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i-1;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
	
	}
	}

	public static void main(String[] args)
	{
		pattern obj=new pattern();
		obj.cal();
	}
		// TODO Auto-generated method stub

}
