class Car
{
	String  color = "紅色";
	int num = 4;

	//運行行為
	void run()
	{
		System.out.println(color+".."+num);
	}
}

class CarDemo
{
	public static void main(String[] args)
	{
		//生產汽車，在java中通過new操作符來完成。
		//其實就是在堆內存產生一個實體。
		Car c = new Car();//c就是一個類類型變量。記住：類類型變量指向對象。
		
		//需求：將己有車的頻色改成藍色。指揮該對象做使用。在java指揮方式是：對象.對象成員。
		c.color = "blue";
		c.run();

		Car c1 = new Car();
		c1.color = "yellow";
		c1.run();
		
		Car q = new Car();
		show(q);
	}
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run();
	}
}