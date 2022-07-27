
/* 
異常在子父類覆蓋中的體現：
1. 子類在覆蓋父類時，如果父類的方法拋出異常，那麼子類的覆蓋方法，只能拋出父類的異常或者異常的子類。
2. 如果父類方法拋出多個異常，那麼子類在覆蓋該方法時，只能拋出父類異常的子集。
3. 如果父類或者接口的方法中沒有異常拋出，那麼子類在覆蓋方法時，也不可以拋出異常，
	如果子類方法發生了異常，就必須要進行try處理，絕對不能拋。
*/

class AException extends Exception
{
}

class BException extends AException
{
}

class CException extends Exception
{
}

class Fu
{
	void show() throws AException
	{
		
	}
}

class Zi extends Fu
{
	void show() throws BException
	{
		
	}
}

class ExceptionDemo7
{
	public static void main(String[] args)
	{
		
	}
}