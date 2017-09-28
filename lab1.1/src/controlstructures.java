
public class controlstructures {
	
	public static boolean isPrime (int x)
	{
		for(int z = 2; z <=(x/2); z++)
		{
			if (x%z == 0)
			{
				return false;
			}
		}	
	}
	
	public static void main (String[] args)
	{
		System.out.println("Hello Java");
		
		for (int i = 0; i<args.length; i++)
	}

}
