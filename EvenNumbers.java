import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int number, i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        number = sc.nextInt();

        System.out.println("List of even numbers: ");
        for (i = 2; i <= number; i = i) {
            System.out.println(i + "");
            i += 2;
        }
    }
}