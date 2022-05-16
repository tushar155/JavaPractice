package Day6;

public class StaticMethod {
	static int a=10;
	int b=20;
	static void m1() //static method
	{
		System.out.println("this is static mehtod:");
		
	}
	
 void m2() //non static method
 {
	System.out.println("this is non static method:");
}
 
 void m3()//Non static method can access static as well as non static variable & method
 //we call this method through object only beacuse it is non static method
 {
	 System.out.println(a);	//access to static variable
	 System.out.println(b);	//access to non static variable
	 m1();	//access to static method
	 m2();	//access to non static method
 }
 
	public static void main(String[] args) {
//static method can directly only access static stuff(static variable&method)
		//example
		System.out.println(a);
		m1();
		
//non- static method can be access through object only
		//example
		StaticMethod obj=new StaticMethod();
		/*	System.out.println(obj.b);
		obj.m2();
	*/
		obj.m3();
	}

}
