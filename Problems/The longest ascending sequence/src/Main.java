//Write a program that reads an array of ints and outputs the length of the longest sequence in strictly
//    ascending order. Elements of the sequence must go one after another. A single number is assumed
//    to be ordered sequence with the length = 1.
//    Input data format
//    The first line contains the size of an array. The second line contains elements of the array separated
//    by spaces.
//    Example
//    The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending
//    order is 5. It includes the following elements: 1 2 3 5 7.
//    Sample Input:
//    10 1 2 4 1 2 3 5 7 4 3
//    Sample Output:
//    5

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] seq = new int[len];
        int count = 1;
        int max = 1;

        for (int i = 0; i < len; i++) {
            seq[i] = sc.nextInt();
        }
        for (int j = 1; j < len; j++) {
            if (seq[j] > seq[j - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();                               //Length of array
//        int[] ar = new int[n];                              //Declaring array
//        for (int i = 0; i < n; i++) {                       //Initializing array
//            ar[i] = sc.nextInt();
//        }
//        int count = 1;                                      //Variable to count ascending numbers
//        int max = 0;                                        //Variable to store max count
//        for (int i = 1; i < n; i++) {
//            if (ar[i] > ar[i - 1]) {                        //if prev elem < current elem then it is in ascending order
//                count++;                                    //Hence, increment the count
//            } else {
//                if (max < count) {                          //if not, then store the max count value and start from 1.
//                    max = count;
//                }
//                count = 1;
//            }
//        }
//        System.out.print(Math.max(max, count));        //Display the max of count and max values
//    }
//}