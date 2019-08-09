
public class replace {
String str="Raj Sethi";
public void cal()
{
	str=str.replace("Raj","Pooja");
	System.out.println("Replaced String is:"+str);
}
public static void main (String arg[])
{
      replace obj=new replace();
      obj.cal();
}
}