import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numLine = scanner.nextLine();
        String[] numsStr = numLine.split("\\W");

        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }

        int shift = scanner.nextInt() % nums.length;
        int[] shiftedNums = new int[nums.length];
        for (int num : nums) {
            shiftedNums[shift] = num;
            shift = shift >= nums.length - 1 ? 0 : ++shift;
        }

        for (int num : shiftedNums) {
            System.out.print(num + " ");
        }
    }
}

//import java.util.Arrays;
//        import java.util.Collections;
//        import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] numbers = scanner.nextLine().split(" ");
//        int distance = scanner.nextInt();
//
//        Collections.rotate(Arrays.asList(numbers), distance);
//
//        for (String ele : numbers) {
//            System.out.print(ele + " ");
//        }
//    }
//}

//import java.util.*;
//class Main {
//    public static void main(String[] args) {
//        var scan = new Scanner(System.in);
//        String[] arrStr = scan.nextLine().split("\\s");
//        int rotation = scan.nextInt();
//        Collections.rotate(Arrays.asList(arrStr), rotation);
//        for (String elem : arrStr) {
//            System.out.print(elem + " ");
//        }
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] nums = scanner.nextLine().split(" ");
//        int rotate = scanner.nextInt();
//
//        String temp;
//        rotate %= nums.length;
//        for (int i = 0; i < rotate; i++) {
//            String lastForSwap = nums[nums.length - 1];
//            for (int j = 0; j < nums.length; j++) {
//                temp = lastForSwap;
//                lastForSwap = nums[j];
//                nums[j] = temp;
//            }
//        }
//
//        for (String el : nums) {
//            System.out.print(el + " ");
//        }
//    }
//}