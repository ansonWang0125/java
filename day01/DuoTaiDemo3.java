/* 
基礎班學生：
	學習，睡覺。
高級班學生：
	學習，睡覺。
可以將這兩類事物進行抽取。
 */
 
abstract class Student
 {
	 publci abstract void study();
	 public void sleep()
	 {
		 System.out.println("躺著睡");
	 }
 }
 
 class BaseStudent extends Student
 {
	 public void study()
	 {
		 System.out.println("base study");
	 }
	 public void sleep()
	 {
		 System.out.println("坐著睡");
	 }
 }
 
  class AdvStudent extends Student
 {
	 public void study()
	 {
		 System.out.println("adv study");
	 }
 }
 
 class DuoTaiDemo3
 {
	 public static void main(String[] args)
	 {
		 BaseStudent bs = new BaseStudent();
		 bs.study();
		 bs.sleep();
	 }
	 
	 public void doSome(Student s)
	 {
		 
	 }
 }