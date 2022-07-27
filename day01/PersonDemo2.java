/*
對象一建立就會調用與之對應的構造函數。

構造函數的作用：可以用於給對象進行初始化。

構造函數的小細節：
當一個類中沒有定義構造函數時，那麼系統會默認給該類加入一個穴參數的構造函數。

當在類中自定義了構造函數後，默認的構造函數就沒有了。

構造函數和一般函數在寫法上有不同。

在運行上也有不同。
構造函數是在對象一建立就運行。給對象初始化。
而一返方法是對象調抈才執行，給是對象添加對象具備的功能。

一個對象建立，構造函數只運行一次。
而一般方法可以被該對象調用多次。

什麼時候定義構造函數呢？
當分析事物時，該事物存在具備一些特性或者行為，那麼將這些內容定義在構造函數中。


*/
class Person
{
	private String name;
	private int age;
	
	/*
	構造代碼塊。
	作用：給對象進行初始戋。
	對象一建立就運行，而且優先於構造函數執行。
	和構造函數的區別：
	構造代碼塊是給所有對象進行統一初始化，
	而構造函數是對應的對象初始化。
	
	構造代碼塊中定義的是不同對象共性的初始內容。
	*/
	{
		//System.out println("person code run");
		cry();
	}
	
	Person()
	{
		System.out.println("A: name="+name+",,age="+age);
	}
	Person(String n)
	{
		name = n;
		System.out.println("B: name="+name+",,age="+age);
	}
	Person(String n, int a)
	{
		name = n;
		age = a;
		System.out.println("C: name="+name+",,age="+age);
	}
	
	public void cry()
	{
		System.out.println("cry......");
	}
}

class PersonDemo2
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		
		Person p2 = new Person("lisi");
		
		Person p3 = new Person("anson",20);
	}
}