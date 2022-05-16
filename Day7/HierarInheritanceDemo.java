package Day7;
//Hiera inheritance means parent class can have multiple child class 
//Example: child 1 and child 2 is having same parent class
class Parent//parent class
{
	int a;
	void print()
	{
		System.out.println("this is parent class:"+a);
	}
}
class child1 extends Parent//child/chain class
{
int b;
	void display()
	{
		System.out.println("this is child1 class:"+b);	
	}
}
class child2 extends Parent//child/chain class
{
int c;
	void display()
	{
	System.out.println("this is child2 class"+c);	
	}
}

public class HierarInheritanceDemo {

	public static void main(String[] args) {
		//accessing parent and child 1 class only
		child1 lobj=new child1();
		lobj.a=30;
		lobj.print();
		lobj.b=10;
		lobj.display();
		
		//accessing parent and child 2 class only
	child2 tobj=new child2();
	tobj.a=30;
	tobj.print();
	tobj.c=10;
	tobj.display();
	
	}

}
