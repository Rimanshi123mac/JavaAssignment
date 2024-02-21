import java.util.Scanner;
public class factorial{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to find factorial : ");
		int num = sc.nextInt();
		int fact = 1, i = 1;
		while(i<=num ){
			fact = i*fact;
			i++;
		}
		System.out.println("Factorial : "+fact);
	}
}