import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        print2dArray(getSpiralArray(dimension));
    }

    public static int[][] getSpiralArray(int dimension) {
        int[][] spiralArray = new int[dimension][dimension];
        int sideLen = dimension;
        int currNum = 1;

        for (int i = 0; i < dimension; i++) {
            // do top side
            for (int j = 0; j < sideLen; j++) {
                spiralArray[i][i + j] = currNum++;
            }
            // do right side
            for (int j = 1; j < sideLen; j++) {
                spiralArray[i + j][dimension - 1 - i] = currNum++;
            }
            // do bottom side
            for (int j = sideLen - 2; j > -1; j--) {
                spiralArray[dimension - 1 - i][i + j] = currNum++;
            }
            // do left side
            for (int j = sideLen - 2; j > 0; j--) {
                spiralArray[i + j][i] = currNum++;
            }
            sideLen -= 2;
        }
        return spiralArray;
    }
    public static void print2dArray(int[][] array) {
        for (int[] row : array) {
            for (int elem : row) {
//                System.out.print(elem + " ");
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
    }
}
