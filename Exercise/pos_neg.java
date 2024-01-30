import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        int pos = 0, neg = 0, zero = 0;

        do {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            else
                zero++;

            System.out.println("Want to enter more numbers y/n");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers= " + pos + "\nNegative Numbers= " + neg + "\nZeros= " + zero);
    }
}
