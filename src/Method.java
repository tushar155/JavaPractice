
public class Method {
	int X=10;
	int y=20;
	//case 1: not taking parameter, not return o/p
	/*void sum()
	{
		System.out.println(X+y);
	}*/
	
	//case 2 not taking parameter, return the o/p
	/*
	int sum()
			{
		return(X+y);
			}
*/
	// case 3: taking parameter, not return value
	/*void sum(int a, int b)
	{
		System.out.println(a+b);
	}*/
	// case 4:: taking parameter, return value
	int sum(int a, int b)
	{
		return(a+b);
	}
	
	public static void main(String[] args) {
		Method cal=new Method();
		//cal.sum(30,20);
		
	System.out.println(cal.sum(20,60));

	}

}
