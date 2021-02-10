package tictactoe;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here Stage 1
//        System.out.print("X O X");
//        System.out.print("O X O");
//        System.out.print("X X O");

        // stage 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");
        String letter = scanner.next();


//        System.out.println("---------"); top lines
        for (int i = 0; i < 9; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int a1 = 0; a1 < 9; a1 += 3) {
            System.out.println("| "+ letter.charAt(a1) + " "+ letter.charAt(a1 + 1) + " "+ letter.charAt(a1 + 2) +" |");
        }

//        System.out.println("---------"); bottom lines
            for (int i = 0; i < 9; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }