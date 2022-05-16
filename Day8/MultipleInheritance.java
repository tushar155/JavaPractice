package Day8;
interface ABC
{
	int a=10;
	void m1();

}
interface BC
{
	int y=20;
	void m2();
}

public class MultipleInheritance implements ABC,BC {
	
	public void m1()
	{
		System.out.println(a);
	}
	public void m2()
	{
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		MultipleInheritance obj=new MultipleInheritance();
		obj.m1();
		obj.m2();

	}

}
