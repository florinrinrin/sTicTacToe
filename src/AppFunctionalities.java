import java.util.Arrays;

public class AppFunctionalities {

    public void initializeGrid (char[][] grid){
        System.out.println("---------");
        grid = new char[][]{{'|','_','_','_','|'},
                            {'|','_','_','_','|'},
                            {'|','_','_','_','|'}};

        printGrid(grid);
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
}
