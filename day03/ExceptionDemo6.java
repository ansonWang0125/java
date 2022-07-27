
第一個格式：
try
{
	
}
catch ()
{
	
}

第二個格式：
try
{
	
}
catch ()
{
	
}
finally
{
	
}
第三個格式：
try
{
	
}
finally
{
	
}

//記住一點：catch是用於處異常，如果沒有catch就代表異常沒有被處理過，如果該異常是檢測時異常，那麼必須聲明。

class Demo
{
	public void method()
	{
		try
		{
			throw new FuShuExcepiton("除數為負數");
		}
		catch (Exception e)
		{
			
		}
	}
}

class ExceptionDemo5
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}