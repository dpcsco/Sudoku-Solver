public class GameState {
    int[][] Board;

    GameState(){
        Board = new int[9][9];
    }

    GameState(int test){
        int[][]Board = {
            {7, 0, 0, 4, 3, 0, 8, 2, 9}, 
            {2, 8, 0, 0, 0, 6, 3, 0, 0},
            {0, 4, 0, 0, 8, 0, 1, 7, 0},
            {9, 0, 0, 7, 5, 2, 0, 0, 0},
            {0, 2, 5, 0, 0, 0, 0, 9, 8},
            {0, 0, 6, 0, 1, 0, 2, 0, 0},
            {0, 0, 4, 0, 0, 0, 9, 1, 2},
            {6, 9, 0, 8, 0, 1, 0, 0, 4},
            {0, 1, 2, 5, 0, 4, 0, 0, 0},
        };
    }

    public void updateUnit(int r, int c, int num){
        Board[r][c] = num;
    }
}
