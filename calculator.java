import java.util.Scanner;
public class calculator{
	public static void main(String[]arg){
		Scanner input=new Scanner(System.in);
		int a,b,c;
		int i=0;
		do
		{
		System.out.println("Enter integer values to perform opeartions");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		float sum,diff,pro,quo;
		String operation;
		input.nextLine();
		operation=input.nextLine();
		if(operation.equals("sum"))
		{
			
			System.out.println("Sum is"+(a+b+c));
		}
		else if(operation.equals("diff"))
		{
		System.out.println("Difference is"+(a-b-c));
		}
		else if(operation.equals("pro"))
		{
		System.out.println("Product is"+(a*b*c));
		}
		else if(operation.equals("quo"))
		{
		System.out.println("Quotient is"+((a/b)/c));
		}
		else
			System.out.println("Operation not found");
		System.out.println("Use again:if yes press 1 else 0");
		i=input.nextInt();
		}while(i==1);
	}
	
}