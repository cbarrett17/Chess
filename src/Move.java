public class Move {
    private Player player;
    private Spot current;
    private Spot destination;
    private GamePiece pieceMoved;
    private GamePiece pieceKilled;

    public Move(Player player, Spot current, Spot destination) {
        this.player = player;
        this.current = current;
        this.destination = destination;
        this.pieceMoved = current.getPiece();
    }
}
