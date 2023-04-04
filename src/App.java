import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.next();

        char[][] grid = {};
        AppFunctionalities appFunctionalities = new AppFunctionalities();
        appFunctionalities.initializeGrid(grid);
        //appFunctionalities.userInputToPosition(userInput,grid);
        AppFunctionalities.checkWinner(grid);
    }
}