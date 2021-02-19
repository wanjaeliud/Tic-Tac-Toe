import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] numbers2 = new int[size];
//       if (size - 1 >= 0) System.arraycopy(numbers, 0, numbers2, 1, size - 1);
        for (int i = 0; i < size - 1; i++){
            numbers2[i + 1] = numbers[i];
        }
        numbers2[0] = numbers[size - 1];
        for (int i = 0; i < size; i++){
            System.out.print(numbers2[i] + " ");
        }
    }
}


//    int length = scanner.nextInt();
//    int[] a = new int[length];
//        for (int i = 1; i <= length; i++) {
//                if (i == length) {
//                a[0] = scanner.nextInt();
//                } else {
//                a[i] = scanner.nextInt();
//                }
//                }
//                for (int num : a) {
//                System.out.print(num + " ");
//                }

//    int size = scanner.nextInt();
//    int[] arr = new int[size];
//        for (int i = 1; i < size + 1; i++) {
//        arr[i % size] = scanner.nextInt();
//        }
//        for (int looper : arr) {
//        System.out.print(looper + " ");
//        }