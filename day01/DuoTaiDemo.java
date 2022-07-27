/* 
多態：可以理解為事物存在的多種體現形態。

人：男人﹑女人

動物：貓﹑狗

貓 x = new 貓();

動物 x = new 貓();

1. 多態的體現
	父類的引用指向了自己的子類對象。
	父類的引用也接受了自己的子類對象。
2. 多態的前提
	必須是類與類之間有關系。要麼繼承，要麼實現。
	通常還有一個前提，存在覆蓋。
3. 多態的好處
	多態的出現大大的提高了程式的擴展性。
4. 多態的弊端
	提高了擴展性，但是只能使用父類的引用訪問父類中的成員。
5. 多態的應用

 */
 
 /* 
動物：
貓﹑狗。
 */
 
 abstract class Animal
 {
	 abstract void eat();
 }
 
 class Cat extends Animal
 {
	 public void eat()
	 {
		 System.out.println("吃魚");
	 }
	 public void catchMouse()
	 {
		 System.out.println("抓老鼠");
	 }
 }
 
class Dog extends Animal
{
	public void eat()
	 {
		System.out.println("吃骨頭");
	 }
	public void kanJia()
	{
		System.out.println("看家");
	}
}
 
class DouTaiDemo
{
	public static void main(String[] args)
	{
		Animal c = new Cat();//類型提升。向上轉型
		function(c);
		 
		Animal d = new Dog();
		function(d);
	}
	
	public static void function(Animal a)
	{
		a.eat();
	}
}
		