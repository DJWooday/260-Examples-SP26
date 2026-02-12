import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("How much you work? ");
//        int numHours = input.nextInt();
//        float payRate = 10.5f;
//
//        float rent = 500;
//        float pay = numHours * payRate;
//
//        System.out.println("How much aura: ");
//        float auraLevel = input.nextFloat();
//        float auraThreshold = 50;
//
//        System.out.println("You made: " + pay * 4 + " this month");
//        int numExceptions = 0;
//        if (pay * 4 > rent || auraLevel > auraThreshold) {
//            System.out.println("You good cuh");
//        } else if (pay * 4 > rent / 2) {
//            if (numExceptions++ == 0) {
//                System.out.println("Fine, but I'm taking your lunch money, nerd, *gives swirly*");
//            } else {
//                System.out.println("Evicted.");
//            }
//        }
//        else {
//            System.out.println("Get rekt.");
//        }

        System.out.print("Game Input: ");
        char move = input.nextLine().charAt(0);

        switch(move) {
            case 'W':
            case 'w':
                System.out.println("Move up");
                break;
            case 'd':
                System.out.println("Move right");
                break;
            case 's':
                System.out.println("Move down");
                break;
            default:
                System.out.println("Invalid move");
                break;
        }

        boolean alive;
        int hp = 0, numLives = 0;
        alive = (hp <= 0 && numLives == 0) ? false : true;
//        if (hp <= 0 && numLives == 0) {
//            alive = false;
//        } else {
//            alive = true;
//        }

        System.out.println("Status alive: " + alive);

        String whoWon;
        int p1Score = 40, p2Score = 50;
        whoWon = (p1Score < p2Score) ? "P2" : "P1";

        System.out.println(whoWon + " won");

        double rand = Math.random();
//        double rand = .25;
        double randHp = rand * (100 - 50) + 50;
        int randHpInt = (int) (rand * (100 - 50 + 1) + 50);
        System.out.println("Random Num: " + randHp);
        System.out.println("Random Num: " + randHpInt);

        int rows = 3, cols = 5;
        int temp = rows;
        rows = cols;
        cols = temp;
        System.out.println(rows + " " + cols);
    }
}
