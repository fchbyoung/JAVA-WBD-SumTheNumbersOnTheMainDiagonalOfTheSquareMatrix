import java.util.Scanner;

public class SquareMatrix {
    public static void sumTheNumbersOnTheMainDiagonalOfTheSquareMatrix () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the order of the square matrix: ");
        int n = scanner.nextInt();
        Integer[][] arr = new Integer[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("a[" + i + "]" + "[" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.print("Sum the numbers on the main diagonal of theSquare matrix is: " + sum);
    }
}
