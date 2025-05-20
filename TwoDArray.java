import java.util.*;
class TwoDArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int rows = s.nextInt();
        int cols = s.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter array elements:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Calculate sum of each row
        for(int i = 1; i <=rows; i++) {
            int sum = 0;
            for(int j = 1; j <= cols; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of row " + i + " is: " + sum);
        }
        s.close();
    }
}
