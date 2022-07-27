/* 
	finally代碼塊，定義一定執行的代碼。
	通常用於關閉資源。
 */

class FushuException extends Exception
{
	FuShuExcepiton(String msg)
	{
		super(msg);
	}
}

class Demo
{
	int div (int a, int b ) throws FuShuExcepiton
	{
		if (b<0)
			throw new FuShuExcepiton("除數為負數");
		return a/b;
	}
}

class ExceptionDemo5
{
	public static void main(String[] args)
	{
		Demo d = new Demo ();
		
		try
		{
			int x = d.div(4,-9);
			System.out.println("x="+x);
		}
		catch ( FuShuExcepiton e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("finally");//finally中存放一定會被執行的代碼。
		}
		
		System.out.println("over");
	}
}