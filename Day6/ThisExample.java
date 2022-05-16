package Day6;

public class ThisExample {
int a,b;//class variable/global variable

//calling this keyword using method
	void sum(int a, int b) //method variable/external variable
	{
		this.a=a;
		this.b=b;
	
}

//calling this keyword using contructor
ThisExample(int a, int b)// parameterize constructor
{
	this.a=a;
	this.b=b;
}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println("the sum of a+ b is:"+(a+b));
	}
	public static void main(String[] args) {
		ThisExample obj=new ThisExample(10,10);
		obj.sum(20, 30);
		obj.display();
	}

}
