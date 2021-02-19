import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        boolean result = true;
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 0; i < size - 1; i++) {
            if (num[i] == n && num[i + 1] == m || num[i] == m && num[i + 1] == n) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] x = new int[size];
//        for (int i = 0; i < size; i++) {
//            x[i] = scanner.nextInt();
//        }
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        for (int i = 0; i < size - 1; i++) {
//            if (x[i] == m && x[i - 1] == n) {
//                System.out.println(false);
//                break;
//            }
//            if (x[i] == n && x[i - 1] == m) {
//                System.out.println(false);
//                break;
//            }
//        }
//        System.out.println(true);
//
//    }
//}