import java.util.Scanner;
public class arraySum{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		float average = 1;
		System.out.println("Enter size of the array : ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter "+n+" values in array");
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.print("Entered array : "); 
		for (int i:arr)
			System.out.print(i+"\t");
		System.out.println("Sum of all the items of given array : "+sum);
		average = sum/n;
		System.out.println("Average : "+average);
	}

}
