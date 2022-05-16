package Practice;

public class Calculation_Assignment {
int x,y,z;
int sum(int x,int y)
{
	return(x+y);
}
int sum(int x,int y,int z)
{
	return(x+y+z);
}
double sum(double x,double y)
{
	return(x+y);
}
double sum(double x,double y,double z)
{
	return(x+y+z);
}
	public static void main(String[] args) {
		Calculation_Assignment obj=new Calculation_Assignment();
		double sum=obj.sum(10, 10,11);
		System.out.println(sum);
	}

}