package Day7;
//example of method overrding
class bank
{
	int a;
	double display()
	{
		return 0;
	}
}
class SBI extends bank
{
	double display()
	{
		return 10.5;
	}
}
class Indian extends bank
{
	double display()
	{
		return 7.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI sobj=new SBI();
		System.out.println(sobj.display());
		
		Indian iobj=new Indian();
		System.out.println(iobj.display());
	}

}
