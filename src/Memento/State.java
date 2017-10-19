package Memento;

/**
 * Created by SG on 2017/10/19.
 */
public class State {

    private State nextState;

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

    public State nextState(){
        return nextState;
    }

    public State(String chessmanName, int chessmanX, int chessmanY) {
        this.chessmanName = chessmanName;
        this.chessmanX = chessmanX;
        this.chessmanY = chessmanY;
    }

    private String chessmanName;
    private int chessmanX;
    private int chessmanY;

    public String getChessmanName() {
        return chessmanName;
    }

    public int getChessmanX() {
        return chessmanX;
    }

    public int getChessmanY() {
        return chessmanY;
    }
}
