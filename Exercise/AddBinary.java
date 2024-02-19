// Program to add two Binary Strings

import java.util.Scanner;
public class AddBinary {

    public static String addBinary(String s1, String s2) {
         int n1 = Integer.parseInt(s1, 2);
         int n2 = Integer.parseInt(s2, 2);
         int sum = n1+n2;
         return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second binary string: ");
        String s2 = sc.nextLine();
        System.out.println("Sum: " + addBinary(s1, s2));
    }
}