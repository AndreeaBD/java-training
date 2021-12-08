package test.java.clean.code.chess.requirements;

import org.junit.Before;
import org.junit.Test;
import main.java.clean.code.chess.requirements.ChessBoard;
import main.java.clean.code.chess.requirements.Pawn;
import main.java.clean.code.chess.requirements.PieceColor;
import main.java.clean.code.chess.requirements.MovementType;

import static org.junit.Assert.assertEquals;

public class PawnTest {

    private ChessBoard chessBoard;
    private Pawn testSubject;
    private Pawn opponentSubject;

    @Before
    public void setUp() {
        this.chessBoard = new ChessBoard();
        this.testSubject = new Pawn(PieceColor.BLACK);
        this.opponentSubject = new Pawn(PieceColor.WHITE);
    }

    @Test
    public void testChessBoard_Add_Sets_XCoordinate() {
        this.chessBoard.addPieceOnChessBoard(testSubject, 6, 3, PieceColor.BLACK);
        assertEquals(6, testSubject.getXCoordinate());
    }

    @Test
    public void testChessBoard_Add_Sets_YCoordinate() {
        this.chessBoard.addPieceOnChessBoard(testSubject, 6, 3, PieceColor.BLACK);
        assertEquals(3, testSubject.getYCoordinate());
    }


    @Test
    public void testPawn_Move_IllegalCoordinates_Right_DoesNotMove() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.Move(MovementType.MOVE, 7, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_IllegalCoordinates_Left_DoesNotMove() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.Move(MovementType.MOVE, 4, 3);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(3, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_Move_LegalCoordinates_Forward_UpdatesCoordinates() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3, PieceColor.BLACK);
        testSubject.Move(MovementType.MOVE, 6, 2);
        assertEquals(6, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
    }

    @Test
    public void testPawn_CaptureLegalCoordinates_Left() {
        chessBoard.addPieceOnChessBoard(testSubject, 6, 3, PieceColor.BLACK);
        chessBoard.addPieceOnChessBoard(opponentSubject, 5, 2, PieceColor.WHITE);
        testSubject.setChessBoard(chessBoard);
        opponentSubject.setChessBoard(chessBoard);
        testSubject.Move(MovementType.CAPTURE, opponentSubject.getXCoordinate(), opponentSubject.getYCoordinate());
        assertEquals(5, testSubject.getXCoordinate());
        assertEquals(2, testSubject.getYCoordinate());
    }

}