/* 
老師用電腦上課。

開始思考上課中出現的問題。

比如問題是
	電腦藍屏。
	電腦冒煙。
	
要對問題進行描述，封裝成對象。

可是當冒煙發生後，出現講課進度無法繼續。

出現了講師的問題：課時計劃無法完成。
 */
 
class LanPingException extends Exception
{
	LanPingException(String message)
	{
		super(message);
	}
}

class SmokeException extends Exception
{
	SmokeException(String message)
	{
		super(message);
	}
}

class NoPlanException extends Exception
{
	NoPlanException(String message)
	{
		super(message);
	}
}

class Computer
{
	private int state = 3;
	public void run() throws LanPingException, SmokeException
	{
		if (state==2)
			throw new LanPingException("藍屏了");
		if (state==3)
			throw new SmokeException("冒煙了");
		System.out.println("電腦運行");
	}
	public void reset ()
	{
		state = 1;
		System.out.println("電腦重啟");
	}
}
 
class Teacher
{
	private String name;
	private Computer cmpt;
	
	Teacher(String name)
	{
		this.name = name;
		cmpt = new Computer();
		
	}
	
	public void prelect() throws NoPlanException
	{
		try
		{
			cmpt.run();
		}
		catch(LanPingException e)
		{
			cmpt.reset();
		}
		catch(SmokeException e)
		{
			test();
			throw new NoPlanException("課時無法繼續  "+e.getMessage());
		}
		
		System.out.println("講課");
	}
	public void test ()
	{
		System.out.println("考試");
	}
}

class ExceptionTest
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher("老師");
		try
		{
			t.prelect();
		}
		catch (NoPlanException e)
		{
			System.out.println(e.toString());
			System.out.println("換老師或放假");
		}
	}
}