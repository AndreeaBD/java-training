package main.java.clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    public void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void setNewCoordinates(int newX, int newY) {
        this.setXCoordinate(newX);
        this.setYCoordinate(newY);
    }

    public void Move(MovementType movementType, int newX, int newY) {
       switch (movementType) {
           case MOVE:
               if(isLegalMove(newX, newY)) {
                   setNewCoordinates(newX, newY);
               }
               break;
           case CAPTURE:
               if(isLegalCapture(newX, newY)) {
                   setNewCoordinates(newX, newY);
               }
               break;
        }
    }

    private boolean isLegalMove(int newX, int newY) {
        if(this.getPieceColor() == PieceColor.WHITE) {
            return !(this.getXCoordinate() != newX || newY - this.getYCoordinate() != 1);
        } else {
            return !(this.getXCoordinate() != newX || this.getYCoordinate() - newY  != 1);
        }

    }

    private boolean isLegalCapture(int newX, int newY) {
        if(!chessBoard.isNotOccupiedPosition(newX, newY)) {
            if(this.getPieceColor() == PieceColor.WHITE) {
                if(newX == this.getXCoordinate() + 1 && newY - this.getYCoordinate()== 1) {
                    return true;
                }
            } else {
                if (newX == this.getXCoordinate() - 1 && this.getYCoordinate() - newY == 1) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
