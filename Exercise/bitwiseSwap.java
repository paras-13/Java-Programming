// Swap without using third variable
import java.util.Scanner;
public class bitwiseSwap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Swapping values without using third variable: ");
		System.out.println("Before Swapping: num1="+num1+" num2="+num2);
		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		System.out.println("After Swapping: num1="+num1+" num2="+num2);
	}
}