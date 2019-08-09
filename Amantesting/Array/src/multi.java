
public class multi {
	int a[][]= {{1,3,},{3,2,}};
	int b[][]= {{2,5,},{2,1,}};
	int c[][]= new int[2][3];
	public void check()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				 c[i][j]= a[i][j]*b[i][j];
				System.out.println(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		multi ss=new multi();
		ss.check();
	}

}
