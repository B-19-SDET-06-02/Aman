package conditional;

import java.util.Scanner;

public class switchcasedemo 
{
   int num1,num2,res,choice;
   Scanner sc=new Scanner(System.in);
public void enter()
{
	System.out.println("Enter value for Num1");
	num1=sc.nextInt();
	System.out.println("Enter value for Num2");
	num2=sc.nextInt();
	
}
public void check()
{
	System.out.println("1.Add\t2.Subtract");
	System.out.println("Enter your Choice");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		 enter();
		 res=num1+num2;
		 System.out.println("Result of Addition is:"+res);
		 break;
	case  2:
		enter();
		 res=num1-num2;
		 System.out.println("Result of Subtraction is:"+res);
		 break;
		 default:
		 System.out.println("Sorry u have entered the wrong choice");
		 break;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchcasedemo obj=new switchcasedemo();
		obj.check();

	}

}
