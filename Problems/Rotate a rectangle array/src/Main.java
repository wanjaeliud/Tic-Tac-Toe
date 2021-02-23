import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of rows
        int m = scanner.nextInt(); // number of columns
        int[][] myArray = new int[n][m];
// read array elements from user input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }
        for (int col = 0; col < m; col++) {
            for (int row = n - 1; row >= 0; row--) {
                System.out.print(myArray[row][col] + " ");
            }
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(myArray[n - 1 - j][i] + " ");
//                }
            System.out.println();
        }
    }
}
