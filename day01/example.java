class Person
{
	private String name;
	private int age;
	private static String country = "cn";
	Person()
	{
		this.name = "haha";
		this.age = 1;
		this.speak();
	}
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	{
		System.out.println(name+".."+age);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void speak()
	{
		System.out.println(this.name+"..."+this.age);
	}
	
	public static void showCountry()
	{
		System.out.println("country="+country);
	}
}

class example
{
	public static void main(String[] args)
	{
		Person p = new Person();
	}
}

/* 
Person p = new Person(); 

該句話都做了什麼事情？
1. 因為new用到了Person.class.所以會先找到Person.class文件並加載到內存中。
2. 執該類中的static代碼塊，如果有的話，給Person.class類進行初始化。
3. 在堆內存中開闢空間，分配內存地址。
4. 在堆內存中建立對象的特有屬性，並進行默認初始化。
5. 對屬性進行顯示初始化。
6. 對對象進行構造代碼塊初始化。
7. 對對象進行對應的構造函數初始化。
8. 將內存地址付給棧內存中的p變量。
*/