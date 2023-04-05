import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppFunctionalities {
    static ArrayList<Character> oPositions = new ArrayList<>();
    static ArrayList<Character> xPositions = new ArrayList<>();
    static ArrayList<Character> emptyPositions = new ArrayList<>();
    public static List<Character> posList = new ArrayList<>();



    public static void printGrid(char[][] grid, String userInput) {

        grid[0][0] = '|';
        grid[0][1] = userInput.charAt(0);
        grid[0][2] = userInput.charAt(1);
        grid[0][3] = userInput.charAt(2);
        grid[0][4] = '|';

        grid[1][0] = '|';
        grid[1][1] = userInput.charAt(3);
        grid[1][2] = userInput.charAt(4);
        grid[1][3] = userInput.charAt(5);
        grid[1][4] = '|';

        grid[2][0] = '|';
        grid[2][1] = userInput.charAt(6);
        grid[2][2] = userInput.charAt(7);
        grid[2][3] = userInput.charAt(8);
        grid[2][4] = '|';
        System.out.println("---------");
        for (char[] row : grid) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.print("---------\n");
    }




    public static void checkWinner(char[][] grid, String userInput) {

        grid[0][0] = '|';
        grid[0][1] = userInput.charAt(0);
        grid[0][2] = userInput.charAt(1);
        grid[0][3] = userInput.charAt(2);
        grid[0][4] = '|';

        grid[1][0] = '|';
        grid[1][1] = userInput.charAt(3);
        grid[1][2] = userInput.charAt(4);
        grid[1][3] = userInput.charAt(5);
        grid[1][4] = '|';

        grid[2][0] = '|';
        grid[2][1] = userInput.charAt(6);
        grid[2][2] = userInput.charAt(7);
        grid[2][3] = userInput.charAt(8);
        grid[2][4] = '|';


        char pos1 = grid[0][1];
        char pos2 = grid[0][2];
        char pos3 = grid[0][3];
        char pos4 = grid[1][1];
        char pos5 = grid[1][2];
        char pos6 = grid[1][3];
        char pos7 = grid[2][1];
        char pos8 = grid[2][2];
        char pos9 = grid[2][3];

        posList.add(pos1);
        posList.add(pos2);
        posList.add(pos3);
        posList.add(pos4);
        posList.add(pos5);
        posList.add(pos6);
        posList.add(pos7);
        posList.add(pos8);
        posList.add(pos9);

        addGridPositionsToList(pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9);

        System.out.println(posList);

        List<Character> topRow = Arrays.asList(pos1, pos2, pos3);
        List<Character> middleRow = Arrays.asList(pos4, pos5, pos6);
        List<Character> bottomRow = Arrays.asList(pos7, pos8, pos9);
        List<Character> leftColumn = Arrays.asList(pos1, pos4, pos7);
        List<Character> middleColumn = Arrays.asList(pos2, pos5, pos8);
        List<Character> rightColumn = Arrays.asList(pos3, pos6, pos9);
        List<Character> crossOne = Arrays.asList(pos1, pos5, pos9);
        List<Character> crossTwo = Arrays.asList(pos3, pos5, pos7);


        List<List<Character>> winningConditions = new ArrayList<>();
        winningConditions.add(topRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftColumn);
        winningConditions.add(middleColumn);
        winningConditions.add(rightColumn);
        winningConditions.add(crossOne);
        winningConditions.add(crossTwo);

        System.out.println("0 positions: " + oPositions);
        System.out.println("X positions: " + xPositions);
        System.out.println("Empty positions: " + emptyPositions);

        boolean xWins = false;
        boolean oWins = false;

        for (List<Character> line : winningConditions) {
            if (xPositions.containsAll(line)){
                xWins = true;
            }
            if (oPositions.containsAll(line)) {
                oWins = true;
            }
        }

        if (xWins && oWins || xPositions.size() > oPositions.size() + 1 || oPositions.size() > xPositions.size() + 1) {
            System.out.println("Impossible");
        } else if (xWins) {
            System.out.println("X wins");
        } else if (oWins) {
            System.out.println("O wins");
        } else if (emptyPositions.size() == 0) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }


        private static void addGridPositionsToList ( char pos1, char pos2, char pos3, char pos4, char pos5, char pos6,
        char pos7, char pos8, char pos9){
            if (pos1 == 'X') {
                xPositions.add(pos1);
            } else if (pos1 == 'O') {
                oPositions.add(pos1);
            } else if (pos1 == '_') {
                emptyPositions.add(pos1);
            }

            if (pos2 == 'X') {
                xPositions.add(pos2);
            } else if (pos2 == 'O') {
                oPositions.add(pos2);
            } else if (pos2 == '_') {
                emptyPositions.add(pos2);
            }

            if (pos3 == 'X') {
                xPositions.add(pos3);
            } else if (pos3 == 'O') {
                oPositions.add(pos3);
            } else if (pos3 == '_') {
                emptyPositions.add(pos3);
            }

            if (pos4 == 'X') {
                xPositions.add(pos4);
            } else if (pos4 == 'O') {
                oPositions.add(pos4);
            } else if (pos4 == '_') {
                emptyPositions.add(pos4);
            }

            if (pos5 == 'X') {
                xPositions.add(pos5);
            } else if (pos5 == 'O') {
                oPositions.add(pos5);
            } else if (pos5 == '_') {
                emptyPositions.add(pos5);
            }

            if (pos6 == 'X') {
                xPositions.add(pos6);
            } else if (pos6 == 'O') {
                oPositions.add(pos6);
            } else if (pos6 == '_') {
                emptyPositions.add(pos6);
            }

            if (pos7 == 'X') {
                xPositions.add(pos7);
            } else if (pos7 == 'O') {
                oPositions.add(pos7);
            } else if (pos7 == '_') {
                emptyPositions.add(pos7);
            }

            if (pos8 == 'X') {
                xPositions.add(pos8);
            } else if (pos8 == 'O') {
                oPositions.add(pos8);
            } else if (pos8 == '_') {
                emptyPositions.add(pos8);
            }

            if (pos9 == 'X') {
                xPositions.add(pos9);
            } else if (pos9 == 'O') {
                oPositions.add(pos9);
            } else if (pos9 == '_') {
                emptyPositions.add(pos9);
            }
        }

}




