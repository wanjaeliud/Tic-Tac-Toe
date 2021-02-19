//There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a
//    size of X2 x Y2 x Z2. You need to determine whether one of the boxes can be put inside the other.
//    It should go in without sticking out. You can rotate both boxes as you want.
//    Important: two equally sized boxes cannot be placed inside one another.
//    See the third test case as an example of how the borderline case should be treated.
//    Input consists of two lines:
//    the first line contains numbers X1, Y1, Z1;
//    the second line contains numbers X2, Y2, Z2.
//    All numbers are integers and greater than 0.
//    Output:
//    "Box 1 < Box 2", if the first box can be put inside the second box ;
//    "Box 1 > Box 2", if the second box can be put inside the first box;
//    otherwise, output "Incompatible".
//    Hint
//    One box can be placed inside the other only if it is strictly smaller by all three dimensions.
//    It does not necessarily mean that boxes cannot have one equal side, as you can rotate them.
//    Sample Input:
//    1 2 3 5 6 4
//    Sample Output:
//    Box 1 < Box 2
//    Sample Input:
//    2 9 4 3 8 1
//    Sample Output:
//    Box 1 > Box 2
//    Sample Input:
//    1 3 7 2 8 3
//    Sample Output:
//    Incompatible


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