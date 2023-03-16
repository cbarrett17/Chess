public abstract class GamePiece {
    private boolean killed;
    private boolean white;

    public GamePiece(boolean white) {
        this.setWhite(white);
    }

    public boolean isWhite() {
        return this.white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isKilled() {
        return this.killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public abstract boolean validMove(GameBoard board, Spot current,
                                      Spot destination);
}


class King extends GamePiece {

    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean validMove(GameBoard board, Spot current, Spot destination) {
        // move is valid if the square is +/- one
        return false;
    }
}


class Queen extends GamePiece {

    public Queen(boolean white) {
        super(white);
    }

    @Override
    public boolean validMove(GameBoard board, Spot current, Spot destination) {
        // move is valid if square is diagonal/equal x or y
        return false;
    }
}


class Knight extends GamePiece {

    public Knight(boolean white) {
        super(white);
    }

    @Override
    public boolean validMove(GameBoard board, Spot current, Spot destination) {
        // move is valid if square is two out, one +/- x/y
        return false;
    }
}


class Bishop extends GamePiece {

    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public boolean validMove(GameBoard board, Spot current, Spot destination) {
        // move is valid if square is diagonal
        return false;
    }
}


class Rook extends GamePiece {

    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean validMove(GameBoard board, Spot current, Spot destination) {
        // move is valid if square is equal x/y
        return false;
    }
}


class Pawn extends GamePiece {

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean validMove(GameBoard board, Spot current, Spot destination) {
        // move is valid if square is +1, +2 on first move
        return false;
    }
}