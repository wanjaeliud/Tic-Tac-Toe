package tictactoe;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // STAGE 1 OF TIC-TAC-TOE GAME
//        System.out.print("X O X");
//        System.out.print("O X O");
//        System.out.print("X X O");

        // STAGE 2 OF TIC-TAC-TOE GAME
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter cells: ");
//        String letter = scanner.next();
//
//
//        for (int i = 0; i < 9; i++) {   //System.out.println("---------"); top lines
//            System.out.print("-");
//        }
//        System.out.println();
//
//        for (int a1 = 0; a1 < 9; a1 += 3) {
//            System.out.println("| "+ letter.charAt(a1) + " "+ letter.charAt(a1 + 1) + " "+ letter.charAt(a1 + 2) +" |");
//        }
//
//            for (int i = 0; i < 9; i++) {
//                System.out.print("-"); //  System.out.println("---------"); bottom lines
//            }
//            System.out.println();

        // STAGE 3 OF TIC-TAC-TOE GAME
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");
        String letter = scanner.next();


        for (int i = 0; i < 9; i++) {   //System.out.println("---------"); top lines
            System.out.print("-");
        }
        System.out.println();

        for (int a1 = 0; a1 < 9; a1 += 3) {
            System.out.println("| "+ letter.charAt(a1) + " "+ letter.charAt(a1 + 1) + " "+ letter.charAt(a1 + 2) +" |");
        }

            for (int i = 0; i < 9; i++) {
                System.out.print("-"); //  System.out.println("---------"); bottom lines
            }
        }
    }

//    Scanner input = new Scanner(System.in);
//            System.out.println("Enter cells: ");
//            String str = scanner.nextLine();
//        System.out.println("---------");
//                System.out.println("| " + str.charAt(0) + " " + str.charAt(1) + " " + str.charAt(2) + " |");
//                System.out.println("| " + str.charAt(3) + " " + str.charAt(4) + " " + str.charAt(5) + " |");
//                System.out.println("| " + str.charAt(6) + " " + str.charAt(7) + " " + str.charAt(8) + " |");
//                System.out.print("---------");

//    Scanner s = new Scanner(System.in);
//        System.out.print("Enter cells :");
//                String c = s.next();
//                char[] arr = c.toCharArray();
//                System.out.println("---------");
//                for(int i = 0; i < 3; i++){
//        System.out.print("| ");
//        if(i == 0) {
//        for(int j = 0; j < 3; j++){
//        System.out.print( arr[j] + " ");
//        }
//        }
//        else if(i == 1) {
//        for(int j = 3; j < 6; j++){
//        System.out.print( arr[j] + " ");
//        }
//        }
//        else if(i == 2) {
//        for(int j = 6; j < 9; j++){
//        System.out.print( arr[j] + " ");
//        }
//        }
//        System.out.println("|");
//        }
//        System.out.println("---------");