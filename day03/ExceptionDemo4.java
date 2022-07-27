

/* 
Exception 中有一個特殊的子類異常RuntimeException運行時異常。

如果在函數內容拋出該異常，函數上可以不用聲明，編譯一樣通過。

如果在函數上聲明了該異常，調用者可以不用進行處理。編譯一樣通過。

之所以不用在函數聲明，是因為不需要讓調用者處理。
當該異常發生，希望程序停止。因為在運行時，出現了無法繼運算的情況，希望停止程序後，
對代碼進行修正。

自定義異常時，如果讓異常的發生，無法在繼進行運算，
就讓自定義異常繼承RuntimeException。


對於異常分兩種：
1. 編譯時被檢測的異常。

2. 編譯時不被檢測的異常(運行時異常。 RuntimeException以及其子類)

 */
class Demo
{
	int div (int a, int b )
	{
		if (b==0)
			throw new ArithmeticException("被零除");
		return a/b;
	}
}

class ExceptionDemo4
{
	public static void main(String[] args)
	{
		Demo d = new Demo ();
		
		int x = d.div(4,-9);
		System.out.println("x="+x);
		
		System.out.println("over");
	}
}