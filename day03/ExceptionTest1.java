/* 
有一個圖形和長方形。
都可以獲取面積。對於面積如果出現非法的數值，視為是獲取面積出現問題。
問題通過異常來表示。
現有對這個程序進行基本設計。
*/

class NoValueException extends Exception
{
	NoValueException (String msg)
	{
		super(msg);
	}
}

interface Shape
{
	void getArea();
}

class Rec implements Shape
{
	private int len, wid;
	
	Rec(int len, int wid) throws NoValueException
	{
		if ( len <= 0 || wid <= 0 )
			throw new NoValueException("輸入值小於等於零");
		else
		{
			this.len = len;
			this.wid = wid;
		}
	}
	
	public void getArea()
	{
		System.out.println(len*wid);
	}
}

class Circle implements Shape
{
	private int radius;
	public static final double PI = 3.14;
	
	Circle(int radius) throws NoValueException
	{
		if ( redius <= 0 )
			throw new NoValueException("輸入值小於等於零");
		else
		{
			this.radius = radius;
		}
	}
	
	public void getArea()
	{
		System.out.println(radius*radius*PI);
	}
}


class ExceptionTest1
{
	public static void main(String[] args)
	{
		try
		{
			Rec r = new Rec(-3,4);
			r.getArea();
		}
		catch(NoValueException e)
		{
			System.out.println(e.toString());
		}
		try
		{
			Circle c = new Cirecle(-8);
			c.getArea();
		}
		catch(NoValueException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("over");
	}
}