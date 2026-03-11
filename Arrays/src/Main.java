import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static float findAvg(float ... nums) {
        float sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println(findAvg(3, 51, 23, 59, 29));

        int numStuds;
        System.out.print("How many students: ");
        Scanner input = new Scanner(System.in);
        //numStuds = input.nextInt();
//        String[] names = {"Kayden", "Caden", "Peyton"};
//        float[] testScores = new float[names.length];
//
//        for (int i = 0; i < testScores.length; i++) {
//            System.out.print("Grade for " + names[i]);
//            testScores[i] = input.nextFloat();
//        }
//
//        float avg = 0;
//        for (float score : testScores) {
//            avg += score;
//        }
//        avg /= testScores.length;
//
//        for (float score : testScores) {
//            score += 10; // Trying to give bonus
//        }
//
//        for (int i = 0; i < testScores.length; i++) {
//            float score = testScores[0];
//            score += 10;
//        }
//
//        for (int i = 0; i < testScores.length; i++) {
//            System.out.println(names[i] + " got " + testScores[i]);
//        }
//
//
//
//        System.out.println("Average: " + avg);

        float[] charges = {2.59f, 600.9f, 40.2f};
        float[] plusTax = new float[charges.length];

        for (int i = 0; i < charges.length; i++)
            plusTax[i] = charges[i];

        for (int i = 0; i < plusTax.length; i++) {
            plusTax[i] = plusTax[i] * 1.1f;
        }

        String[] names = {"Peyton", "Kaden", "Kadynce", "Jason", "William", "Sarah", "Demir"};
        Arrays.sort(names);
        int x = Arrays.binarySearch(names, "Kayden");
        System.out.println("Kaden is at: " + x);
        System.out.println(Arrays.toString(names));
        System.out.println();

//        int[] grid = new int[20];
//        Arrays.fill(grid, 1);
//        System.out.println(Arrays.toString(grid));

        char[][] tictac = {
                {'X', 'O', ' '},
                {'X', ' ', 'O'},
                {' ', 'O', ' '}
        };
        tictac[2][0] = 'X';
        System.out.println(Arrays.toString(tictac));

        char[][] grid = new char[3][5];
        System.out.println(grid[0].length);
        for (int row = 0; row < grid.length; row++)
            Arrays.fill(grid[row], '0');

        for (int row = 0; row < grid.length; row++)
            for (int col = 0; col < grid[row].length; col++)
                System.out.print(grid[row][col]);

        //for (int i = 0; i < grid.length * grid[0].length)

    }
}
