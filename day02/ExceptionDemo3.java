/* 
因為項目中會出現特有的問題，
而這些問題並未被java所描述並封裝對象。
所以對於這些特有的問題可以按照java的對問題封裝的思想。
將特有的問題。進行自定義的異常封裝。

自定義異常。

需求：在本程序中，對於除數是-1, 也視為是錯誤的是無法進行運算的。
那麼就需要對這個問題進行自定義的描述。

當在函數內部出現了throw拋出異常對象，那麼就必須要給對應的處理動作。
要麼在內部try catch處理。
要麼在函數上聲明讓調用者處理。

一般情況在，函數內出現異常，函數上需要聲明。


發現打印的結果中只有異常的名稱，卻沒有異常的信息。
因為自定的異常並未定莪信息。

如何定義異常信息呢？
因為父類中己經把異常信息的操作都完成了。
所以子類只要在構造時，將異常信息傳遞給父類通過super語句。
那麼就可以直接通過getMessage方法獲取自定義的異常信息。

自定義異常：
必須是自定義類繼承Exception。

繼承Exception原因：
異常體系有一個特點：因為異常類和異常對象都被拋出。
他們都具備可抛性。這個可拋性是Throwable這個體系中獨有特點。

只有這個體系中的類和對象才可以被throws和throw操作。

throw和throw的區別
throws使用在函數上。
throw使用在函數內。

throws後面跟的異常類，可以跟多個，用逗號隔開。
throw後跟的是異常對象。
 */
 
class FuShuException extends Exception
{
	private int value;
	
	FuShuException(String msg, int value)
	{
		super(msg);
		this.value = value;
	}
	public int getValue()
	{
		return this.value;
	}
}

class Demo
{
	int div(int a, int b) throws FuShuException
	{
		if ( b < 0 )
			throw new FuShuException("出現了除數為負數 / by negative number", b);//手動通過throw關鍵字拋出一個自定義異常對象
		return a/b;
	}
}

class ExceptionDemo3
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,-1);
			System.out.println("x = "+x);
		}
		catch(FuShuException e)
		{
			System.out.println("負數");
			System.out.println(e.toString());// 異常名稱： 異常信息
			System.out.println("錯誤的負數是：" + e.getValue());
		}
		
		System.out.println("over");
	}
}