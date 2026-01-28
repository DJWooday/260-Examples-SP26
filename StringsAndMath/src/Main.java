import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char nl = '\n';
        char tab = '\t';
        System.out.println("Tab spacing " + tab + " ends here" + nl);

        String name = "William";
        char lastLetter = name.charAt(name.length()-1);
        System.out.println(name + "'s last letter is " + lastLetter);

        Scanner input = new Scanner(System.in);
//        String restaurant = input.nextLine();
//        int spaceIndex = restaurant.indexOf(' ');
//        String menuItem = restaurant.substring(0, spaceIndex);
//        System.out.println(restaurant + " serves " + menuItem + "s");

        System.out.print("How many minutes have you been in class? ");
        int timeInput = input.nextInt();
        int hours = timeInput / 60;
        int minutes = timeInput % 60;
        System.out.println("You have been in class for " + hours + " hours and " + minutes + " minutes.");
    }
}
