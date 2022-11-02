public class GameBoard {
    Spot[][] spots;

    public GameBoard() {
        this.initBoard();
    }

    public void initBoard() {
        int whiteRow = 0;
        int blackRow = 7;
        int whitePawns = 1;
        int blackPawns = 6;

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
        populateBoardPieces(whiteRow, true);
        populateBoardPieces(blackRow, false);
    }

    private void populateBoardPieces(int pieceRow, boolean isWhite) {
        spots[pieceRow][0].setPiece(new Rook(isWhite));
        spots[pieceRow][1].setPiece(new Knight(isWhite));
        spots[pieceRow][2].setPiece(new Bishop(isWhite));
        spots[pieceRow][3].setPiece(new Queen(isWhite));
        spots[pieceRow][4].setPiece(new King(isWhite));
        spots[pieceRow][5].setPiece(new Bishop(isWhite));
        spots[pieceRow][6].setPiece(new Knight(isWhite));
        spots[pieceRow][7].setPiece(new Rook(isWhite));
    }
}
