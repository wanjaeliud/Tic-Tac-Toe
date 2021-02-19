//Write a program that reads an array of ints and outputs the maximum product of two adjacent
//    elements in the given array of non-negative numbers.
//    Input data format
//    The first line of the input contains the number of elements in the array.
//    The second line contains the elements of the array separated by spaces.
//    The array always has at least two elements.
//    Sample Input:
//    2 5 3
//    Sample Output:
//    15

import java.util.*;
//import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        int product = 0;

        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            if (product <  num[i] * num[i + 1]) {
                product = num[i] * num[i + 1];
            }
        }
        System.out.println(product);
    }
}

