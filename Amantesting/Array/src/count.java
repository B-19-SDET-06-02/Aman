
public class count {
	int ar[] []= {{1,2,3},{4,5,6},{7,8,9}};
	public void cal()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("\t" + ar[i][j]);
			}
			System.out.println();
				
		}
	}
	public static void main(String arg[])
	{
		count oo=new count();
		oo.cal();
	}

}
