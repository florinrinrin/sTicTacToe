import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppFunctionalities {
    static ArrayList<Integer> playerPositions = new ArrayList<>();
    char[][] grid = new char[3][3];

    public void initializeGrid(char[][] grid) {
        System.out.println("---------");
        grid = new char[][]{{'|', '_', '_', '_', '|'},
                {'|', '_', '_', '_', '|'},
                {'|', '_', '_', '_', '|'}};

        //printGrid(grid);


    }

    private static void printGrid(char[][] grid) {
        for (char[] row : grid) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.print("---------");
    }

    public static List<Character> posList = new ArrayList<>();
    public void userInputToPosition(String userInput, char[][] grid) {
        char symbol = ' ';

        gridPosition(grid);

        grid = new char[3][5];
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


        printGrid(grid);
    }

    private void gridPosition(char[][] grid) {
        grid = new char[3][5];
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
    }

    public static void checkWinner(char[][] grid) {
        grid = new char[3][5];
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

        List<Character> leftRow = Arrays.asList(pos1, pos2, pos3);
        List<Character> middleRow = Arrays.asList(pos4, pos5, pos6);
        List<Character> bottomRow = Arrays.asList(pos7, pos8, pos9);
        List<Character> leftColumn = Arrays.asList(pos1, pos4, pos7);
        List<Character> middleColumn = Arrays.asList(pos2, pos5, pos8);
        List<Character> rightColumn = Arrays.asList(pos3, pos6, pos9);
        List<Character> crossOne = Arrays.asList(pos1, pos5, pos9);
        List<Character> crossTwo = Arrays.asList(pos7, pos5, pos3);

        List<List> winningConditions = new ArrayList<>();
        winningConditions.add(leftRow);
        winningConditions.add(middleRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftColumn);
        winningConditions.add(middleColumn);
        winningConditions.add(rightColumn);
        winningConditions.add(crossOne);
        winningConditions.add(crossTwo);

        for (List l : winningConditions) {
            if (playerPositions.containsAll(l)) {
                System.out.println("Yey you won!");

            } else {
                System.out.println("idk man:(");
            }

        }



    }
}




