class Car
{
	String  color = "����";
	int num = 4;

	//�B��欰
	void run()
	{
		System.out.println(color+".."+num);
	}
}

class CarDemo
{
	public static void main(String[] args)
	{
		//�Ͳ��T���A�bjava���q�Lnew�ާ@�Ũӧ����C
		//���N�O�b�鷺�s���ͤ@�ӹ���C
		Car c = new Car();//c�N�O�@���������ܶq�C�O��G�������ܶq���V��H�C
		
		//�ݨD�G�N�v�������W��令�Ŧ�C�����ӹ�H���ϥΡC�bjava�����覡�O�G��H.��H�����C
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