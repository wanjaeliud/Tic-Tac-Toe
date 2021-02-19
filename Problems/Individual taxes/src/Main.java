//In some country, there are N companies, and the law of that country says that the taxes of each company
//    are individual and appointed by a president. President wants to know which company pays the most
//    taxes. But sadly, none of the president's proxies know math very well, so this work is transferred
//    to you. Can you solve this problem?  The first line of the input contains N which is the number of
//    companies in this country. The second line contains the yearly incomes of each company.
//    All numbers are non-negative integers. The third line contains individual taxes for each company
//    in percent of the company's income. All numbers are integers from 0 to 100 inclusive.
//    You should output № of the company that pays the most taxes. Keep in mind that the enumeration of
//    the companies starts with number 1. If there are several companies with the same payment sizes,
//    output the number of the company with the lowest number.
//    Note: be careful not to lose fractional parts while performing your calculations.
//    All input and output numbers are integers, but you may have to use a different type for storing
//    intermediate values.
//    Sample Input:
//    1 1 1 or 2\n 50 100\n 10 10
//    Sample Output:
//    1  2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] incomes = new int[number];
        int[] taxes = new int[number];
        double max = 0;
        int index = 0;
        for (int i = 0; i < number; i++) {
            incomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < number; i++) {
            taxes[i] = scanner.nextInt();
        }
        for (int i = 0; i < number; i++) {
            double amount = taxes[i] * incomes[i] / 100.0;
            if (max < amount) {
                max = amount;
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] income = new int[size];
//        int[] percentage = new int[size];
//        for (int i = 0; i < size; i++) {
//            income[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < size; i++) {
//            percentage[i] = scanner.nextInt();
//        }
//        int[] taxes = new int[size];
//        for (int i = 0; i < size; i++) {
//            if (income[i] == 0 && percentage[i] == 0) {
//                taxes[i] = 0;
//            } else if (income[i] == 0 || percentage[i] == 0) {
//                taxes[i] = 0;
//            } else {
//                taxes[i] = income[i] * percentage[i];
//            }
//        }
//        int position = 1;
//        if (size != 1) {
//            for (int i = 1; i < size; i++) {
//                if (taxes[i] > taxes[i - 1]) {
//                    position = i + 1;
//                }
//            }
//        }
//        System.out.println(position);
//    }
//}