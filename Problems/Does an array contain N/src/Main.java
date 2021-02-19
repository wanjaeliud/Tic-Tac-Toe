import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        boolean result = false;
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int i : num) {
            if (i == n) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}