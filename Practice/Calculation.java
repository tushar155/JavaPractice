package Practice;

public class Calculation {
int a;
int b;
int c;
Calculation(){
	a=10;
	b=20;
	c=30;
}
int sum()
{
	return(a+b+c);
	}

	public static void main(String[] args) {
		Calculation ob=new Calculation();
		int cal=ob.sum();
		System.out.println(cal);

	}

}
