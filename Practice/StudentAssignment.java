package Practice;

public class StudentAssignment {

	int sid, sub1,sub2,sub3;
	String sname;
	
	
	void getstudata(int a,String b) {
		sid=a;
		sname=b;
		System.out.println(sid+" "+sname);
	}
	void stumark(int a,int b, int c) {
		sub1=a;
		sub2=b;
		sub3=c;
	
	}
	int totalmark()
	{
	
		return sub1+sub2+sub3;
	}

	public static void main(String[] args) {
		
		StudentAssignment tushar1=new StudentAssignment();
		StudentAssignment tushar2=new StudentAssignment();
		
		
		tushar2.stumark(10,10,10);
		tushar1.getstudata(1,"tushar");
	
	System.out.println(tushar2.totalmark());
		
		/*tushar1.getstudata(1,"ashish");
		tushar2.getstudata(2,"Sachin");
		tushar3.getstudata(3,"Manny");
		
		tushar1.stumark(10, 10, 10);
		tushar2.stumark(9, 10, 9);
		tushar3.stumark(8, 7, 10);*/
		
		//tushar1.totalmark(1,"tushar",10,10,10);
		//tushar2.totalmark(2,"Sachin",9,10,9);
		//tushar3.totalmark(3,"manny",8,7,10);

		
	}

}
