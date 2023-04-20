public class Move {
    private GamePiece piece;
    private Spot start;
    private Spot end;
    private GamePiece pieceMoved;
    private GamePiece pieceKilled;

    public Move(GamePiece piece, Spot current, Spot destination) {
        this.piece = piece;
        this.start = current;
        this.end = destination;
        this.pieceMoved = current.getPiece();
    }
}
