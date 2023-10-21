package com.ranjini;

public class ExceptionClass {
	public static void main(String [] args)throws Exception {
		
		int i = 20;
		try {
			System.out.println(i/0);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("12");
			System.out.println(10);
		}
			finally
		{
				int i1 = 30;
			System.out.println(i1/4);
		}
		for (int j=1; j<=10; j++)
		{
			if (j==10)
			{
				throw new Exception();
			}
			System.out.println(j);
		}
		{
			int i2 = 10;
					int i3 = 20;
					System.out.println(i2*i3);
		}
		
	}

}

