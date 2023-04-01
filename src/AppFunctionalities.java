import java.util.Arrays;

public class AppFunctionalities {

    public void initializeGrid (String[][] grid){
        grid = new String[][]{{" "," "," "},
                              {" "," "," "},
                              {" "," "," "}};
        System.out.println(Arrays.deepToString(grid));
    }
}
