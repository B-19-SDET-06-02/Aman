package conditional;

public class myfirst {
	int a=10;
	int b=20;
	int c=30;
	public void call()
	{
		String result=a>b&&a>c?"a is greatest":b>c?"b is greatest":"c is greatest";
		System.out.println(result);
	}
	public static void main(String arg[])
	{
		myfirst obj=new myfirst();
		obj.call();
	}

}
