public class Spot {
    private int x;
    private int y;
    private GamePiece piece;

    public Spot(int x, int y) {
        this.setX(x);
        this.setY(y);
        this.setPiece(null);
    }

    public void setPiece(GamePiece piece) {
        this.piece = piece;
    }

    public GamePiece getPiece() {
        return this.piece;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
}
