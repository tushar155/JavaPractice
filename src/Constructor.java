
public class Constructor {
	int x;
	int y;
	int z;
	char a;
	
	Constructor()//default constructor
	{
		 x=100;
		y=100;
		System.out.println(x+y);
	}
	Constructor(int x, int y)// parameterized contructor
	{
		System.out.println(x+y);
	}
	Constructor(int x, String a)// same parameter but different data type
	{
		System.out.println(x+a);
		//System.out.println(a);
	}
	Constructor(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
		Constructor sam=new Constructor(10, 220);
		Constructor dont=new Constructor(110, "tushar");
		Constructor same=new Constructor(110,20,789);
		
	}

}
