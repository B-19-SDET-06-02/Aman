
public class vowels 
{
	String line="hello friends";
    int vowel;
	public void cal()
	{
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if(ch == 'a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u')
			{
				++vowel;
			}
			
		}
		System.out.println(vowel);}
		public static void main(String arg[])
		{
			vowels oo=new vowels();
			oo.cal();
		}
	}

		