/* 
異常：就是程序在運行時出現不正常情況。
異常由來：問題也是現實生活中一個具體的事物，也可以通過java的類形式進行描述。並封裝成對象。
			其實就是java對不正常情況進行描述後的對象體現。
			

對於問題的劃分：兩種，一種是嚴重的問題，一種非嚴重的問題。

對於嚴重的，java通過Error類進行描述。
	對於Error一般不編寫針對性的代碼對其進行處理。
	
對於非嚴重的，java通過Exception類進行描述。
	對於Exception可以使用針對性的處理方式進行處理。
	
無論Error或者Exception都具有一些共性內容。
比如：不正常情況的信息，引發原因等。

Throwable
	|--Error
	
	|--Exception
	
	
2. 異常的處理

java 提供了特有的語句進行處理。
try
{
	需要被檢測的代碼;
}
catch(異常類 變量)
{
	處理異常的代碼; (處理方式)
}
finally
{
	一定會執行的語句;
}

3. 對捕獲到的異常對象進行常見方法操作。
	String getMessage(): 獲取異常信息。
	

在函數上聲明異常。
便於提高安全性，讓調用出進行處理。不處理編譯失敗。


對多異常的處理。

1. 聲明異常時，建議聲明更為具體的異常。這樣處理的可以更具體。
2. 對方聲明幾個異常，就對應有幾個catch塊，不要定義多餘的catch塊。
	如果多個catch塊中的異常出現繼承關系，父類異常catch塊在最下面。
	
建議在進行catch處理時，catch中一定要定義具體處理方式。
不要簡單定義一句 e.printStackTrace()。
也不要簡單的就書寫一條輸出語句。

 */

class Demo
{
	int div(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException//在功能上通過throws的關鍵字聲明了該功能有可能會出現問題。
	{
		int [] arr = new int[a];
		
		System.out.println(arr[4]);
		return a/b;
	}
}

class ExceptionDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		try
		{
			int x = d.div(4,0);
			System.out.println("x = "+x);
		}
		catch (ArithmeticException e)//Exception e = new ArithmeticException();
		{
			System.out.println("除零");
			System.out.println(e.getMessage());// /by zero;
			System.out.println(e.toString());// 異常名稱： 異常信息
			
			e.printStackTrace();// 異常名稱，異常信息，異常出現的位置。
							//其實jvm默認的異常處理機制，就是在調用printStackTrace方法。
							//打印異常的跟踪信息。
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("角標越界!");
		}
		
		System.out.println("over");
	}
}