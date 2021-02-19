import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];

        int count = 0;
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
//        for (int i = 0; i < size; i++) {
//            if (n == num[i]) {
//                 count++;
//            }
//        }
        for (int y : num) {
            if (y == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}