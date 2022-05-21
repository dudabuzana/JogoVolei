package Controller;

import java.util.List;

/**
 * Observer utilizado para o Score do Jogo
 * 
 * @author Maria Eduarda Sandner Buzana
 */
public interface GameScoreObserver {

    void resetGame();

    void refreshScore(int x, int y);

    void updateList();

    public void wonSet(int i, int set, String[] list);

    public void finishGame(int i);

}
