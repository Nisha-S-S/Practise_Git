
import java.util.Scanner;

public class mult_div {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a");
		a = sc.nextInt();
		System.out.println("Enter the value of b");
		b = sc.nextInt();
		int mult_ans = a*b;
		// division code to be added
		float div_ans = a/b;

		System.out.println("The multiplication is : "+ mult_ans);
		//division code statement to be added
		System.out.println("The division is :"+div_ans);
		sc.close();
		
	}

}
