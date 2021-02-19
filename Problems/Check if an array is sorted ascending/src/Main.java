import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        boolean result = true; // suppose the array is well-ordered
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 1; i < size; i++) {
            if (num[i - 1] > num[i]) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}

//        for (int i = 1; i < size - 1; i++) {
//        result = (num[i] != n || num[i + 1] != m) && (num[i] != n || num[i - 1] != m)
//        && (num[i] != m || num[i + 1] != n) && (num[i] != m || num[i - 1] != n);
//        }