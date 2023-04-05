import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        char[][] grid = {{'|', '_', '_', '_', '|'},
                {'|', '_', '_', '_', '|'},
                {'|', '_', '_', '_', '|'}};

        AppFunctionalities appFunctionalities = new AppFunctionalities();
        AppFunctionalities.printGrid(grid,userInput);
        AppFunctionalities.checkWinner(grid, userInput);

    }
}