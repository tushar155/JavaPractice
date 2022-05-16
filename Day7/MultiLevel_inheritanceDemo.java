package Day7;
class AB	//parant class
{
	int a;
	
	void display() 
	{
	System.out.println("this is the value of class A:"+a);
	}
}
class BC extends AB// chain class
{
int b;

void print()
	{
	System.out.println("this is the value of class B:"+b);
	}
}
class CD extends BC// chain class
{
int c;

void See()
	{
	System.out.println("this is the value of class B:"+c);
	}
}
public class MultiLevel_inheritanceDemo {

	public static void main(String[] args) {
		 CD cobj=new CD();
		 cobj.a=100;
		 cobj.b=200;
			 cobj.c=300;
			 cobj.display();
				cobj.print();
				cobj.See();

	}

}
