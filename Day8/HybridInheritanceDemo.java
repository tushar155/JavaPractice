package Day8;
class A
{
	int a=10;
	void m1() {
		System.out.println(a);
	}
}
interface B
{
	int b=10;
}
interface C 
{
	int c=20;
}
class D extends A implements B,C
{
	int d;
	 int sum()
	 {
		 
	 return (d=a+b+c);
	 }
}
public class HybridInheritanceDemo {

	public static void main(String[] args) {
	D obj=new D();
	int ref=obj.d;
	System.out.println(ref);

	System.out.println(obj.sum());
	}

}
