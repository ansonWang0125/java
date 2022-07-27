interface Inter
{
	void method();
}

class member implements Inter
{
	public void method()
	{
		System.out.println("test");
	}
}





class Test
{
	public static void main(String[] args)
	{
		new member().method();
	}
}