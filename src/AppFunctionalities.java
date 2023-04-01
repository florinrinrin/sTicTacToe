import java.util.Arrays;
import java.util.Scanner;

public class AppFunctionalities {

    char[][] grid = new char[3][3];

    public void initializeGrid (char[][] grid){
        System.out.println("---------");
        grid = new char[][]{{'|','_','_','_','|'},
                            {'|','_','_','_','|'},
                            {'|','_','_','_','|'}};

        //printGrid(grid);



    }

    private static void printGrid(char[][] grid) {
        for (char[] row : grid){
            for (char c : row){
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.print("---------");
    }

    public void userInputToPosition(String userInput, char[][] grid){
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
}
