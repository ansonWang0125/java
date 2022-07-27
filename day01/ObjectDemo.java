/* 
Object：是所有對象的直接後者間接父類，傳說中的上帝。
該類中定義的肯定是所有對象都具備的功能。

Object類中己經提供了對對象是否相同的比較方法。

如果自定義中也有比較相同的功能，沒有必要重新定義。
只要沿襲父類中的功能，建立自己特比較內容即可。這就是覆蓋。
 */
 
class Demo
{
	private int num;
	Demo(int num)
	{
		this.num = num;
	}
	
	public boolean equals (Object obj) //object obj = new Demo();
	{
		if (!(obj instanceof Demo))
			return false;
		Demo d = (Demo) obj;
		
		return this.num == d.num;
	}
	/* public boolean compare(Demo d)
	{
		return this.num==d.num;
	} */
	
	public String toString()
	{
		return "demo:"+num;
	}
	
}

/* class Person
{
	
} */

class ObjectDemo
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo(4);
		Demo d2 = new Demo(5);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		//Class c = d1.getClass();
		
		
		
		/* System.out.println(c.getName());
		System.out.println(c.getName()+"@@"+Integer.toHexString(d1.hashCode()));
		
		
		System.out.println(d1.toString());
		 */
		// System.out.println(d1.equals(d2));//比的是地址
		
/* 		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1.equals(p2)); */
	}
}