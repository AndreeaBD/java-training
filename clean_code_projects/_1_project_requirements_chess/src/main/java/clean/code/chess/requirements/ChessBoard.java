package main.java.clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;
    private int blackPiecesOnBoard;
    private int whitePiecesOnBoard;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void addPieceOnChessBoard(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(isLegalBoardPosition(xCoordinate, yCoordinate) && isNotOccupiedPosition(xCoordinate, yCoordinate) && !hasMaximumNumberOfPieces()) {
            pieces[xCoordinate][yCoordinate] = pawn;
            pieces[xCoordinate][yCoordinate].setXCoordinate(xCoordinate);
            pieces[xCoordinate][yCoordinate].setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate].setPieceColor(pieceColor);
            pawn.setNewCoordinates(xCoordinate, yCoordinate);

            if(pieceColor == PieceColor.BLACK) {
                blackPiecesOnBoard++;
            } else {
                whitePiecesOnBoard++;
            }
        } else {
            pawn.setNewCoordinates(-1, -1);
        }
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return (xCoordinate < 7 && xCoordinate >= 0) && (yCoordinate < 7 && yCoordinate >= 0);
    }

    public boolean isNotOccupiedPosition(int xCoordinate, int yCoordinate) {
        if(isLegalBoardPosition(xCoordinate, yCoordinate)) {
            return pieces[xCoordinate][yCoordinate] == null;
        }

        return false;
    }

    public boolean hasMaximumNumberOfPieces() {
        if(this.blackPiecesOnBoard == 2 * MAX_BOARD_WIDTH || this.whitePiecesOnBoard == 2 * MAX_BOARD_WIDTH) {
            return true;
        }

        return false;
    }
}
