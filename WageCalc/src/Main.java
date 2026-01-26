import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pay, taxRate;
        final float hourlyRate = 10.5f;

        System.out.print("Enter hours worked: ");
        int hoursWorked = input.nextInt();
        input.nextLine();

        System.out.print("Enter tax rate: ");
        taxRate = input.nextFloat();
        input.nextLine();

        System.out.print("Enter name: ");
        String name = input.nextLine();

        pay = hourlyRate * hoursWorked * (1-taxRate);
        String msg = "Hi " + name + ", you made: ";

        System.out.println(msg + pay);
    }
}
