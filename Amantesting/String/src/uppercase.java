
public class uppercase 
{
	String str="Raj Sethi";
	String st[];
	public void cal()
	{
		System.out.println("------To Upper------");
		str=str.toUpperCase();
		System.out.println(str);
		
	}
	public static void main (String arg[])
	{
	      uppercase obj=new uppercase();
	      obj.cal();
	}
}
