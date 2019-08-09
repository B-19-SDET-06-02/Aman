
public class Reverse {
	String str="kulveer";
	int count=str.length();
	String rev=new String();
	public void check()
	{
		for(int i=count-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println("Reversed string is:");
		System.out.println(rev);
	}
	public static void main(String arg[])
	{
		Reverse obj=new Reverse();
		obj.check();
		
	}

}
