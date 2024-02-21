//---------------------------Fibonacci Series------------------------------
import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int num1 = 1, num2 = 1, sum = 0;
		System.out.println("Enter  the value to print fibonnaci series upto : ");
		int num = sc.nextInt();
		System.out.print(num1+"\t");
		System.out.print(num2+"\t");
		while(num1 <= num){
			sum = num1 + num2;
			System.out.print(sum+"\t");
			num1 = num2;
			num2 = sum;
		}
	}
}