//Write a program that reads an array of lowercase strings and checks whether the array is in alphabetical
//    order or not.
//    There are some rules to compare a pair of strings a and b:
//    First chars of strings are compared: a[0] and b[0]. If a[0] comes earlier than b[0] in the alphabet,
//    then a comes before b in terms of alphabetical order. If the first chars are the same, then the second
//    chars are compared, and so on.
//    If a position is reached where one string has no more chars to compare while the other does, then
//    the shorter string is deemed to come first in alphabetical order.
//    Finally, identical strings are always in alphabetical order.
//    You can use compareTo  method of the String class to compare 2 strings. If this String object
//    alphabetically precedes the argument string, then the result is a negative integer.
//    The result is a positive integer if this String object alphabetically follows the argument string.
//    The result is zero if the strings are identical. This is exactly what you need to compare 2 strings
//    in terms of alphabetical order!
//    For example
//    System.out.println("abc".compareTo("acd")); // -1 "abc" < "acd"
//    System.out.println("abc".compareTo("aac")); //  1 "abc" > "aac"
//    System.out.println("abc".compareTo("abc")); //  0 "abc" = "abc"
//    Input data format  The single input line contains lowercase strings separated by spaces.  Output data format  Only a single word: true or false.
//    Sample Input:
//    a b c
//    Sample Output:
//    true

import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] alpha = scanner.nextLine().split(" ");
        int len = alpha.length;
        boolean compare = true;

        for (int i = 0; i < len - 1; i++) {
            if (alpha[i].compareTo(alpha[i + 1]) > 0) {
                compare = false;
                break;
            }
        }
        System.out.println(compare);
    }
}

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String arrayAsString = scanner.nextLine().trim().toLowerCase();
//        String[] arr = arrayAsString.split(" ");
//        boolean result = true;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (!compare(arr[i], arr[i + 1])) {
//                result = false;
//                break;
//            }
//        }
//        System.out.println(result);
//    }
//
//    public static boolean compare(String aString, String bString) {
//        char[] a = aString.toCharArray();
//        char[] b = bString.toCharArray();
//        int aLength = a.length;
//        int bLength = b.length;
//
//        for (int i = 0; i < Math.min(aLength, bLength); i++) {
//            if (a[i] > b[i]) {
//                return false;
//            }
//        }
//        return aLength <= bLength;
//    }
//}