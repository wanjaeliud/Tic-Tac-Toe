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
        int max = num[0];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (max < num[i]) {
                max = num[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}