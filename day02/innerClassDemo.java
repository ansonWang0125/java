/* 
內部類的訪問規則：
1. 內部類可以直接訪問外部類中的成員，包括私有。
	之所以可以直接訪問外部類中的成員是因為內部類中持有了一個外部類的引用，格式 外部類名.this
2. 外部類要訪問內部類，必須建立內部類對象。

訪問格式：
1. 當內部類定義在外部類的成員位置上，而非私有，可以在外部其他類中。
可以直接建立內部類對象。
格式
	外部類名.內部類名  變量名 = 外部類對象.內部類對象;
	Outer.Inner in = new Outer().new Inner();
	
2. 當內部類在成員位置上，就可以被成員修飾符所修飾。
	比如，private: 將內部類在外部類中進行封裝。
		static：內部類就具備static的特性。
		當內部類被static修後，只能直接訪問外部類中的static成員。出現了訪問局限。
		
		在外部其他類中，如何直接訪問static內部類的非靜態成員呢？
		new Outer.Inner().function;
		
		在外部其他類中，如何直接訪問static內部類的靜態成員呢？
		Outer.Inner.function();
	
	注意：當內部類中定義了靜態成員，該內部類必須是static的。
		  當外部類中的靜態方法訪問內部類時，內部類也必須是靜態的
		  
		  
		  
當描述事物時，事物的內部還有事物，該事物用內部類來描述。
因為內部事備事務在使用外部事物的內容。


	
 */
class Outer
{
	private int x = 3;
	
	private class Inner //內部類
	{
		void function()
		{
			System.out.println("inner :"+x);
		}
	}
	
	void method()
	{
		Inner in = new Inner();
		in.function();
	}
}



class InnerClassDemo
{
	public static void main(String[] args)
	{
		// Outer out = new Outer();
		// out.method();
		
		Outer.Inner.function();
		
		//new Outer.Inner().function;
		
		//直接訪問內部類中的成員。
		// Outer.Inner in = new Outer().new Inner();
		// in.function();
	}
}