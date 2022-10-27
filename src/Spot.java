public class Spot {
    private int x;
    private int y;
    private GamePiece piece;

    public Spot(int x, int y, GamePiece piece) {
        this.setX(x);
        this.setY(y);
        this.setPiece(piece);

    }

    private void setPiece(GamePiece piece) {
        this.piece = piece;
    }

    private GamePiece getPiece() {
        return this.piece;
    }

    private void setX(int x) {
        this.x = x;
    }

    private int getX() {
        return this.x;
    }

    private void setY(int y) {
        this.y = y;
    }

    private int getY() {
        return this.y;
    }
}
