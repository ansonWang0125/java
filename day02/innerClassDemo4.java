/* 
匿名內部類：
1. 匿名內部類其實就是內部類的簡寫格式。
2. 定義我匿名內部類的前提：
	內部類必須是繼承一個類或者實現接口。
3. 匿名內部類的格式：new 父類或者接口()(定莪子類的內容)
4. 其實匿名內部類就是一個匿名子類對象，而且這個對象有點胖。可以理解為帶內容的對象。
5. 匿名內部類中定義的方法最好不要超3個。

 */
 
abstract class AbsDemo
{
	abstract void show();
}
 
class Outer
{
	int x = 3;
	
	class Inner extends AbsDemo
	{
		int a = 4;
		void show()
		{
			System.out.println(" showa :"+a);
		}
	}
	
	
	public void function()
	{
		new Inner().show();
		new AbsDemo()
		{
			int b = 5;
			void show()
			{
				System.out.println(" showb ="+b);
			}
		}.show();
	}
}

class InnerClassDemo4
{
	public static void main(String[] args)
	{
		new Outer().function();
	}
}

