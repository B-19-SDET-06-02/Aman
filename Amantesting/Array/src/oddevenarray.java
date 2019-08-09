
public class oddevenarray {
		int i;
		int[] j = new int[10];
		public void main()
		{
			for(i=0;i<=9;i++)
			{
				j[i]=i+1;
				if(j[i]%2==0)
				{
					System.out.println(j[i] +" is even");
				}
				else
				{
					System.out.println(j[i] +" is odd");
				}
					
			}
		}
		public static void main(String arg[])
		{
			oddevenarray oo=new oddevenarray();
			oo.main();
		}
	}
