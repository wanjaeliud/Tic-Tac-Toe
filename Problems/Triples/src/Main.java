import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < size - 2; i++) {
            if (num[i] == num[i + 1] - 1 && num[i] == num[i + 2] - 2) { //checking if three consecutive ints in increasing order differing by 1
                counter++;
            }
        }
        System.out.println(counter);
    }
}

// sum of two number at indexies
//public class Main {
//    public static void main(String[] args) {
//    }
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//}