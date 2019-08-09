
public class split
{
	String str="Raj Sethi";
	String st[];
	public void cal()
	{
		System.out.println("Splitting String");
		st=str.split(" ");
		System.out.println(st[1]);
		
	}
	public static void main (String arg[])
	{
	      split obj=new split();
	      obj.cal();
	}
}


