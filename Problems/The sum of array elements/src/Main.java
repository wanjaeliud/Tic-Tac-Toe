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
        int sum = 0;
        for (int array : num) {
            sum = sum + array;
        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += num[i];
//        }
        System.out.println(sum);
    }

}