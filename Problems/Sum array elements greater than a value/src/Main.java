import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // read array size
        int len = scanner.nextInt();
        int[] num = new int[len];

        // read elements of an array
        for (int i = 0; i < len; i++) {
            num[i] = scanner.nextInt();
        }

        // read the number of n and calculate the sum
        int n = scanner.nextInt();
        int sum = 0;
        for (int value : num) {
            if (value > n) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}