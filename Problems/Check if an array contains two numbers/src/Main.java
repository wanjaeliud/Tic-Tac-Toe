// Write a program that reads an unsorted array of integers and two numbers n and m. The program must
//    check if n and m occur next to each other in the array (in any order).
//    Input data format
//    The first line contains the size of an array.
//    The second line contains elements of the array.
//    The third line contains two integer numbers n and m.
//    All numbers in the same line are separated by the space character.
//    Output data format
//    Only a single value: true or false.
//    Sample Input:
//    3\n  1 3 2\n 2 3
//    Sample Output:
//    true

import  java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = new int[size];
        boolean check = false;

        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i < size; i++) {
            if (((num[i - 1] == n) && (num[i] == m)) || ((num[i] == n) && (num[i - 1] == m))) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}