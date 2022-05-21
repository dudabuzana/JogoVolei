package Controller;

import Model.Team;
import Model.Game;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador referente ao Jogo
 * 
 * @author Maria Eduarda Buzana
 */
public class GameController {
    
    private int set = 1;
    private String[] list = new String[5];
    private Game game;

    private static GameController instance = null;

    public static GameController getIntance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    private GameController() {
        game = new Game(new Team(), new Team(), "");
    }

    private int getSet() {
        return set;
    }

    private void addSet() {
        this.set++;
    }

    public Game getGame() {
        return game;
    }
    
    /**
     * Realiza o aumento da Pontuação do Jogo
     * 
     * @param i 
     */
    public void addScore(int i) {
        switch (i) {
            case 1:
                game.getTeam1().addScore();
                break;
            case 2:
                game.getTeam2().addScore();
                break;
        }
        if (this.set < 5) {
            verifyScore(25);
        } else {
            verifyScore(15);
        }
        notifyRefreshScore();
        verifyWonGame();
    }

    /**
     * Realiza a redução da Pontuação do Jogo
     * 
     * @param i 
     */
    public void subScore(int i) {
        switch (i) {
            case 1:
                game.getTeam1().subScore();
                break;
            case 2:
                game.getTeam2().subScore();
                break;
        }
        notifyRefreshScore();
    }

    /**
     * Realiza a verifição da Pontuação, se a mesma é suficiente para ganhar um Set
     * 
     * @param min
     */
    private void verifyScore(int min) {
        if (game.verifyTeam1WonSet(min)) {
            saveData(game.getTeam1().getScore(), game.getTeam2().getScore());
            notifyWonSet(1);
            return;
        }
        if (game.verifyTeam2WonSet(min)) {
            saveData(game.getTeam1().getScore(), game.getTeam2().getScore());
            notifyWonSet(2);
            return;
        }
    }

    /**
     * Verifica se um determinado Time venceu
     */
    private void verifyWonGame() {
        int teamWonGame = game.verifyTeamWonGame();
        if (teamWonGame != 0) {
            notifyWhoWon(teamWonGame);
            return;
        }
    }

    /**
     * Salva o Placar de um determinado Set
     * 
     * @param score1
     * @param score2 
     */
    private void saveData(int score1, int score2) {
        list[getSet() - 1] = "Set " + getSet() + ": " + game.getTeam1().getName() 
        + " | " + score1 + " X " + score2 + " | " + game.getTeam2().getName();
    }

    /**
     * Reseta todo o Placar do Jogo
     */
    public void resetGame() {
        game.setTeam1(new Team());
        game.setTeam2(new Team());
        list = new String[5];

        notifyRefreshScoreboard();
    }

    private final List<GameScoreObserver> addGameScoreObserver = new ArrayList<>();

    public void attach(GameScoreObserver obs) {
        this.addGameScoreObserver.add(obs);
    }

    public void detach(GameScoreObserver obs) {
        this.addGameScoreObserver.remove(obs);
    }

    private void notifyRefreshScore() {
        for (GameScoreObserver GameScore : addGameScoreObserver) {
            GameScore.refreshScore(game.getTeam1().getScore(), game.getTeam2().getScore());
        }
    }

    private void notifyWonSet(int i) {
        addSet();
        game.getTeam1().setScore(0);
        game.getTeam2().setScore(0);
        for (GameScoreObserver GameScore : addGameScoreObserver) {
            GameScore.wonSet(i, getSet(), list);
        }
    }

    private void notifyRefreshScoreboard() {
        for (GameScoreObserver GameScore : addGameScoreObserver) {
            GameScore.resetGame();
        }
    }

    private void notifyWhoWon(int i) {
        for (GameScoreObserver GameScore : addGameScoreObserver) {
            GameScore.finishGame(i);
        }
    }

}
