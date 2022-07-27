/* 
接口：初期理解，可以認為是一個特殊的抽象類
	當抽象類中的方法都是抽象的，那麼該類可以通過接口的形式來表示。
class用於定義類
interface 用於定義接口。

接口定義時，格式特點：
1. 接口中常見定義：常量，抽象方法。
2. 接口中的成員都有固定修飾符。
	常量：public static final
	方法：public abstract
記住：接口中的成員都是public的。

接口：是不可以創建對象的，因為有抽象方法。
需要被子類實現，子類對接口中的抽象方法全都覆蓋後，子類才可以實例化。
否則子類是一個抽象類。

接口可以被類多實現，也是對多繼承不支持轉換形式。java支持多實現。
 */
 
interface Inter
{
	public static final int NUM = 3;
	public abstract void show();
}

interface InterA
{
	public abstract void method();
}

class Demo
{
	public void function(){};
}

class Test extends Demo implements Inter, InterA
{
	public void show(){};
	public void method(){};
}

interface A
{
	void methodA();
}

interface B extends A
{
	void methodB();
}

interface C extends B
{
	void methodC();
}

class D implements C 
{
	public void methodA(){};
	public void methodB(){};
	public void methodC(){};
}


class InterfaceDemo
{
	public static void main(String[] args)
	{
		Test t = new Test();
		System.out.println("Hello World");
	}
}