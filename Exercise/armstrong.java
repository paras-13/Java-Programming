
// Welcome to GDB Online.
import java.util.Scanner;
import java.lang.Math;
public class armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int temp = num;
		int pow=0;
		int armstrong = 0;
		while(temp>0)
		{
		    pow++;
		    temp/=10;
		}
		temp = num;
		while(temp>0)
		{
		    int rem = temp%10;
		    armstrong += (int)Math.pow(rem,pow);
		    temp/=10;
		}
		if(armstrong == num) System.out.println(num+" is an Armstrong Number.");
		else System.out.println(num+" is not an Armstrong Number.");
	}
}
