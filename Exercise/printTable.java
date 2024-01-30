
import java.util.Scanner;
public class printTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		printTable(num);
	}
	public static  void printTable(int num) {
		System.out.println("Printing Table of "+num+":");
		for(int i=0; i<=num*2; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}