interface Inter
{
	void method();
}

class Test
{
	
	
	
	static Inter fuction()
	{
		return new Inter ()
		{
			void method()
			{
				System.out.println("success");
			}
		};
	} 
	
	
	/* static class Inner implements Inter
	{
		public void method()
		{
			System.out.println("method run");
		}
	}
	
	static Inter fuction()
	{
		return new Inner();
	}  */
}

class InnerClassTest
{
	public static void main(String[] args)
	{
		Test.fuction().method();
	}
}