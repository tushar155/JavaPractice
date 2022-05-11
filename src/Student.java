
public class Student {
int sid;
char grade;
String name;

Student(int id, String sname,char sgrade)
{
	sid=id;
	grade=sgrade;
	name=sname;
	}

/*void getvalue(int id, String sname,char sgrade)//parameter||argument
{
	sid=id;
	grade=sgrade;
	name=sname;
	}*/

	void display()
	{
		System.out.println(sid);
		System.out.println(name);
		System.out.println(grade);
	}
	
}
