public class Game {
    private GameBoard board;
    private Player white;
    private Player black;

    public Game() {
        super();
    }

    public void setColorWhite(Player player) {
        this.white = player;
    }

    public void setColorBlack(Player player) {
        this.black = player;
    }

    public GameBoard getBoard() {
        return board;
    }

    public void setBoard(GameBoard board) {
        this.board = board;
    }

    public Player getWhite() {
        return white;
    }

    public void setWhite(Player white) {
        this.white = white;
    }

    public Player getBlack() {
        return white;
    }

    public void setBlack(Player black) {
        this.black = black;
    }

    public void initBoardWithPlayers() {
    }
}
