/* 
內部類定義在局部時，
1. 不可以被成員修飾修飾
2. 可以直接訪問外部中的成員，因為還持有外部類中的引用。
	但是不可以訪問它所在的局部中的變量，只能訪問被final修飾的局部變量。
 */
class Outer
{
	int x = 3;
	void method()
	{
		class Inner 
		{
			void function()
			{
				System.out.println(Outer.this.x);
			}
		}
		new Inner().function();
	}
}


class InnerClassDemo3
{
	public static void main(String[] args)
	{
		new Outer().method();
	}
}