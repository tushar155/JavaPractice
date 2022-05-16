package Day6;

public class CallByValue {
	int x;
	
	void sum(int a, int b)
	{
		x=a+b;
		//System.out.println(x);
	}

	public static void main(String[] args) {
		CallByValue tushar=new CallByValue();
		tushar.sum(10,20);
		System.out.println(tushar.x);//calling method sum 'x' value using obj this is called callbyvalue method

	}

}
