package Day9_protected;
import Day9.AccesClassB;


/*public class ProtectedAccess extends AccesClassB {
//protected access modifier example-Access through inheritance concept only
  
	public static void main(String[] args) {
		ProtectedAccess obj=new ProtectedAccess();
		obj.display();
	

	}*/
	public class ProtectedAccess {
//Public access modifier example-Direct Access 
		public static void main(String[] args) {
			AccesClassB obj=new AccesClassB();
			obj.display();
		

		}


}


