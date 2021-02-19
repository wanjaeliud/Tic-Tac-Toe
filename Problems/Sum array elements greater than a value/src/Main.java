//Write a program that reads an array of ints and an integer number n . The program must sum all the
//    array elements greater than n .
//    Input data format  The first line contains the size of an array.
//    The second line contains elements of the array separated by spaces.
//    The third line contains the number n.  Output data format  Only a single number representing the sum.
//    Sample Input:
//    5 5 8 11 2 10 8
//    Sample Output:
//    21

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // read array size
        int len = scanner.nextInt();
        int[] num = new int[len];
        int sum = 0;
        // read elements of an array
        for (int i = 0; i < len; i++) {
            num[i] = scanner.nextInt();
        }

        // read the number of n and calculate the sum
        int n = scanner.nextInt();
        for (int value : num) {
            if (value > n) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}