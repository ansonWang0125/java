/*
private :私有，權限修飾符： 用於修飾類中的成員(成員變量，成員函數)。
私有只在本類中有效。

將age私有化以後，類以外即使建立了對象也不能直接訪問。
但是人應該有年齡，就需要在Person類中提供對應訪問age的方式。

注意： 私有僅僅是封裝的一種表現形式。

之所以對外提供訪問方式，就因為可以在訪問方式中加入邏輯判斷等語句。
對訪問的數據進行操作。提高代碼健壯性。
*/
class Person
{
	private int age;
	
	public void setAge(int a)
	{
		if ( age >= 0 ){
			age = a;
		}
		else{
			System.out.println("Age should be nonegtive");
		}
	}
	
	public int getAge()
	{
		return age;
	}
	
	void speak()
	{
		System.out.println("age="+age);
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();
		
		p.setAge(20);
		p.speak();
	}	
}