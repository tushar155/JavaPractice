package Practice;
interface A1{
	int a=10;
	int b=20;
	void add();
}
interface B1{
	int x=20;
	int y=40;
	void mul();
	
}

class Calculation1 implements A1,B1 {
	public void add() {
		System.out.println("addition of a and B:"+(a+b));
	}
	public void mul()
	{
		System.out.println("multiplication of x and B is:"+(x+y));
	}
}


public class MultipleInheritance_assignment extends Calculation1{

	public static void main(String[] args) {
		MultipleInheritance_assignment obj=new MultipleInheritance_assignment();
		obj.add();
		obj.mul();
		
	}

}
