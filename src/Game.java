import java.util.ArrayList;
import java.util.List;

public class Game {
    private GameBoard board;
    private Player currentPlayer;

    private List<Player> players;
    private List<Move> movesMade;

    private void initGame(Player player1, Player player2) {
        players.set(0, player1);
        players.set(1, player2);
    }
}
