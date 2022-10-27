public class GameBoard {
    Spot[][] spots;

    public GameBoard() {
        this.initBoard();
    }

    private void initBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j; j < 8; j++) {
                spots[i][j] = new Spot(i, j, new Rook(true));
            }
        }
    }
}
