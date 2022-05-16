package Practice;
interface A{
	int a=10;
	int b=20;
	void sum();
}

public class Interface_assignment implements A{
	
		public void sum() {
		System.out.println(a+b);
		}

	public static void main(String[] args) {
		Interface_assignment obj=new Interface_assignment();
		obj.sum();
		

	}

}
