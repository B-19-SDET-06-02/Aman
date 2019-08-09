
public class splitarray {
		int i;
		int[] j = {1,2,3,4,5,6,7,8,9,10};
		int n = j.length;
		
		int[] a = new int[5];
		int[] b = new int[5];
		public void main()
		{
			for(i=0;i<10;i++)
			{
				if(i<5)
				{
					a[i]=j[i];
				}
				else
				{
					b[i-5]=j[i];
				}
				
			}
			
			for(i=0;i<5;i++)
			{
				System.out.println(a[i]);
			}
			
			System.out.println("secound");

			for(i=0;i<5;i++)
			{
	
				System.out.println(b[i]);
			}

		}
		public static void main(String arg[])
		{
			splitarray oo=new splitarray();
			oo.main();
		}
}
