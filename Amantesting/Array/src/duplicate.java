
public class duplicate
{
	int [] arr= {5,1,3,4,2,7,5,8,1}; 
    public void cal()
	{    
      for(int i = 0; i < arr.length; i++)
      {  
        for(int j = i + 1; j < arr.length; j++)
         {  
            if(arr[i] == arr[j])  
             System.out.println(arr[j]);  
        }  
    }  
} 
	public static void main(String arg[])
	{
		duplicate obj=new duplicate();
		obj.cal();
	}
}