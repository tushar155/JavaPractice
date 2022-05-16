package Day7;
//Example of single inheritance 
class A	//parant class
{
	int a;
	
	void display() 
	{
	System.out.println("this is the value of class A:"+a);
	}
}
class B extends A// chain class
{
int b;

void print()
	{
	System.out.println("this is the value of class B:"+b);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		//A aobj=new A();
		//aobj.a=10;
		//aobj.display();
		 
		B bobj=new B();
		bobj.a=20;
		bobj.b=20;
		bobj.display();
		bobj.print();
	

		
 
	}

}
