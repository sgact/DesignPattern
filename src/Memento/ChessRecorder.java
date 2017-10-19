package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SG on 2017/10/19.
 */
public class ChessRecorder {

    private List<State> memonto = new ArrayList<>();

    public ChessRecorder() {
    }

    public void moveChess(Chessman chessman, int dx, int dy){
        saveCurrentState(chessman);
        updateChessmanState(chessman, dx, dy);
        printCurrentState();
    }

    public void restoreStateAt(int index){
        for (int i = memonto.size() - 1; i >= 0; i--){
            if (i > index - 1){
                memonto.remove(i);
            }
        }
        System.out.println("悔棋，当前状态为： ");
        printCurrentState();
    }

    public void restoreBack(){
        restoreStateAt(memonto.size() -1 );
    }

    private void printCurrentState() {
        State state = memonto.get(memonto.size() - 1);
        System.out.println("State: " + memonto.size() +
                " 棋子(" + state.getChessmanName() + ")处于["
                + state.getChessmanX() + ", " + state.getChessmanY() + "]");
    }

    private void updateChessmanState(Chessman chessman, int dx, int dy) {
        chessman.setX(chessman.getX() + dx);
        chessman.setY(chessman.getY() + dy);
    }

    private void saveCurrentState(Chessman chessman) {
        State currentState = new State(chessman.getName(), chessman.getX(), chessman.getY());
        memonto.add(currentState);
    }

}
