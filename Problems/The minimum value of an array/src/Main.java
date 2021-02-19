import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        int min = num[0];
        for (int i = 1; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(min);
    }
}