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
        timeInput += 30;
//        timeInput = timeInput + 30;
        int hours = timeInput / 60;
        int minutes = timeInput % 60;
        System.out.println("In an hour and half, you'll have been in class for " + hours++ + " hours and " + minutes + " minutes.");
        System.out.println(hours);

//        // Absolute value
//        float num = -76.5f;
//        double squared = Math.pow(num, 2);
//        double abs = Math.pow(squared, .5);
//        System.out.println(abs);
//        System.out.println(Math.pow(Math.pow(num, 2), .5));

        System.out.println("How many pizzas we bringin: ");
        int numPizzas = input.nextInt();
        int numStudents = 30;
        double areaOfPizza = Math.PI * Math.pow(6, 2) * numPizzas;

        double numPizzasDouble = numPizzas;
        int areaOfPizzaInt = (int)(areaOfPizza+.5);

        System.out.println("Pizza per student: " + (float) numPizzas / numStudents);
        System.out.println("Pizza sq. inches per student: " + areaOfPizza / numStudents);
    }
}
