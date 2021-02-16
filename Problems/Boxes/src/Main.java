import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

        Arrays.sort(box1);
        Arrays.sort(box2);

        if (box1[0] < box2[0] && box1[1] < box2[1] && box1[2] < box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box2[0] < box1[0] && box2[1] < box1[1] && box2[2] < box1[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}

//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
//        int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
//        int count1 = 0;
//        int count2 = 0;
//
//        Arrays.sort(box1);
//        Arrays.sort(box2);
//
//        for (int i = 0; i < box1.length; i++) {
//            if (box1[i] < box2[i]) {
//                count1++;
//            } else if (box2[i] < box1[i]) {
//                count2++;
//            }
//        }
//
//        if (count1 == 3) {
//            System.out.println("Box 1 < Box 2");
//        } else if (count2 == 3) {
//            System.out.println("Box 1 > Box 2");
//        } else {
//            System.out.println("Incompatible");
//        }
//    }
//}