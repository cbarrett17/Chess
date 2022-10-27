import java.util.List;

public class GameBoard {
    Spot[][] spots;
    List<Integer> pieceColor;
    List<Integer> piecePlace;

    public GameBoard() {
        this.initBoard();
    }

    public void initBoard() {
        int whitePieces = 0;
        int blackPieces = 7;
        int whitePawns = 1;
        int blackPawns = 6;

        pieceColor.set(0, whitePieces);
        pieceColor.set(1, blackPieces);
        piecePlace.set(0, whitePawns);
        piecePlace.set(1, blackPawns);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                spots[i][j] = new Spot(i, j);
            }
        }

        for (int i = 0; i < 8; i++) {
            spots[i][whitePawns].setPiece(new Pawn(true));
        }

        for (int i = 0; i < 8; i++) {
            spots[i][blackPawns].setPiece(new Pawn(true));
        }

        // add pieces for placement 0 and 7
    }
}
