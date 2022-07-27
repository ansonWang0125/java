/* 
this:看上去，是用於區分局部變量和成員變量同名情況。
this為什麼可以解決這個問題？
this到底代表的是什麼呢？

this: 就代表本類的對象，到底代表叩哪一個呢？
	this 代表它所在函數所屬對象的引用。
 */
class Person
{
	private String name;
	private int age;
	
	Person(String n)
	{
		this.name = n;
	}
	Person(String n, int a)
	{
		this.name = n;
		age = a;
		System.out.println("C: name="+name+",,age="+age);
	}
	
	public void speak()
	{
		System.out.println("C: name="+name+",,age="+age);
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