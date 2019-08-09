
public class onetwothree {
		int i;
		int n,j;
		String m="";
		public void table() {
			for(i=1;i<=9;i++)
			{
				for(j=1;j<=3;j++)
				{
					m+=i;
					i++;
				}
					i--;
				System.out.println(m);
				m="";
			}
		}
			public static void main(String[] args) {
				
				onetwothree obj=new onetwothree();
				obj.table();
					}
	}
