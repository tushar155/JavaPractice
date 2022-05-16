package Day8;

interface AB
{
int a=10;
void m1();
}

public class InterfaceDemo implements AB{
	public void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
	InterfaceDemo obj=new InterfaceDemo();
	obj.m1();
				

	}

}
