class Fu
{
	int num = 5;
	void method1()
	{
		System.out.println("fu method_1");
	}
	void method2()
	{
		System.out.println("fu method_2");
	}
}

class Zi extends Fu
{
	int num = 8;
	void method1()
	{
		System.out.println("zi method_1");
	}
	void method3()
	{
		System.out.println("zi method_3");
	}
}

class DuoTaiDemo4
{
	public static void main(String[] args)
	{
		Fu f = new Zi();
		
		System.out.println(f.num);
		
		Zi z = new Zi();
		System.out.println(z.num);
		
		// f.method1();
		// f.method2();
		//f.method3();
		
/* 
在多態中成員(非靜態)函數的特點：
在編譯時期：參閱引用型變量所屬的類中是否有調用的方法。如果有，編譯通過，如果沒有編譯失敗。
在運行時期：參閱對象所屬的類中是否有調用的方法。
簡單總結就是：成員函數在多態調用時，編譯看左邊，運行看右邊。


在多態中，成員變量的特點：
無論編譯和運行，都參考左邊(引用型變量所屬的類)。

在多態中，靜態成員函數的特點：
無論編譯和運行，都參考做左邊。

 */
		
		// Zi z = new Zi();
		// z.method1();
		// z.method2();
		// z.method3();
	}
}