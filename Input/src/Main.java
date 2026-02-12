import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hoursWorked;
        float hourlyPay = 10.5f;

        System.out.print("How many hours did you work: ");
        hoursWorked = input.nextInt();
        input.nextLine();
        System.out.print("What's your name? ");
        String name = input.nextLine();

        System.out.println(name + ", you made " + hoursWorked * hourlyPay);
    }
}
