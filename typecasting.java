public class typecasting
{
	public static void main(String[] arg){
	// widening(Automatic)------------

	int a = 5;
	double mydou=a;
	System.out.println(a);
	System.out.println(mydou);

	//narrowing(Manual)---------------

	double val= 9.78d;
	int b = (int)val;
	System.out.println(val);
	System.out.println(b);
	}
}