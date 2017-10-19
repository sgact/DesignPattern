package Memento;

/**
 * Created by SG on 2017/10/19.
 */
public class MemontoClient {

    public static void main(String[] argv){

        Chessman ju = new Chessman("车");

        ChessRecorder recorder = new ChessRecorder();

        recorder.moveChess(ju, 1, 2);
        recorder.moveChess(ju, 4, -6);
        recorder.moveChess(ju, 2, 3);
        recorder.moveChess(ju, 0, 9);
        recorder.moveChess(ju, 7, 8);

        recorder.restoreBack();
        recorder.restoreStateAt(2);

    }
}
