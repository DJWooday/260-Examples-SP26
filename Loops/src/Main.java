import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        while (counter < 10) {
            sum += counter;
            counter++;
        }
        System.out.println(counter);
        System.out.println(sum);

        sum = 0;
        int i;
        for (i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(i);
        System.out.println(sum);


        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        System.out.println();

        count = 0;
        do {
            count++;
            System.out.println(count);
        } while (count < 10);

        Scanner input = new Scanner(System.in);
//        int length;
//        do {
//            System.out.print("Gimme grid length [10-30]: ");
//            length = input.nextInt();
//
//        } while(length < 10 || length > 30);

//        System.out.print("Gimme grid length [10-30]: ");
//        length = input.nextInt();
//        while (length < 10 || length > 30) {
//            System.out.print("That was wrong, grid length [10-30]: ");
//            length = input.nextInt();
//        }

        // nesting
        int rows = 3, cols = 5;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Row: " + row + " Col: " + col);
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print((row * cols) + col + " ");
            }
            System.out.println();
        }

        for (int c = 0; c < 35; c++) {
            if (c % 2 == 0) continue;
            System.out.print(c + " ");
        }


        do {
            System.out.print("Game Input (q to quit): ");
            char move = input.nextLine().charAt(0);
            if (move == 'q') break;
        } while (true);
    }
}
