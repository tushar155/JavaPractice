
public class Studentmain {

	public static void main(String args[]){
		
		//approch1-assigning value using object refrance values
	/*
		Student tushar1=new Student();
		tushar1.sid=10;
		tushar1.name="David";
		tushar1.grade='a';
		tushar1.display();
	*/
		//approch 2- using method
		/*
		Student tushar1=new Student();
		Student tushar2=new Student();
		Student tushar3=new Student();
		
		
		tushar1.getvalue(100, "David", 'A');
		tushar2.getvalue(1200, "ashish", 'A');
		tushar3.getvalue(120, "sachin", 'A');
		
		tushar1.display();
		tushar2.display();
		tushar3.display();
		*/
		//approch 3 using constructor
		Student tushar1=new Student(100, "David", 'A');
		Student tushar2=new Student(1200, "ashish", 'A');
		Student tushar3=new Student(120, "sachin", 'A');
		tushar1.display();
		tushar2.display();
		tushar3.display();

	}

}
