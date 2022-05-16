package Day7;
class Friends
{
String Name="Tushar";
void display()
{
	System.out.println(Name);
}
void meeting()
{
	System.out.println("all friend are togehter:");
}
}

class humans extends Friends
{
	String Name="Hamza";
	void display()
	{
		System.out.println(Name);//this is providing value of exisiting class
		System.out.println(super.Name);// super keyword will provide the vlaue from the parent class
	}
	void meeting()
	{
		System.out.println("only human friends are meeting togehter:");
		super.meeting();
	}
}
public class SuperKeywordClass {

	public static void main(String[] args) {
		

	}

}
