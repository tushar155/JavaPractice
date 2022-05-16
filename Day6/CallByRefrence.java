package Day6;

public class CallByRefrence {
	int x;
	void sum(CallByRefrence a)
	{
		x=a.x+5;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		CallByRefrence tushar=new CallByRefrence();
		
		tushar.x=10;
		
		tushar.sum(tushar);//calling 

	}

}
