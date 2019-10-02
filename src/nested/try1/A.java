package nested.try1;

public class A 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("outer try start");
			int a=10/2;
			System.out.println("outer try 222");
			try
			{
				System.out.println("inner try start");
				int b=10/0;
				System.out.println("inner try end");
				
			}
     	catch(/*ArithmeticException e*/ NullPointerException e)
			{
				System.out.println("inner catch block");
			}
			
			finally
			{
				System.out.println("inner finally block");
			}
			System.out.println("outer try end");
		}
		
  		catch(ArithmeticException e)
  		{
  				System.out.println("outer catch block");
  		}
		finally
		{
			System.out.println("outer finally block");
		}
		System.out.println("program end");
  		}
		
		
	}

