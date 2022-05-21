package Model;

/**
 * Modelo referente à Entidade Jogo
 * 
 * @author Maria Eduarda Buzana
 */
public class Game {
   
    private Team team1;
    private Team team2;
    private String horario;

    public Game(Team team1, Team team2, String horario) {
        this.team1 = team1;
        this.team2 = team2;
        this.horario = horario;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public boolean verifyTeam1WonSet(int min) {
        if (team1.getScore() >= min && team1.getScore() > team2.getScore() + 1) {
            team1.wonSet();
            return true;
        }
        return false;
    }
    
    public boolean verifyTeam2WonSet(int min) {
        if (team2.getScore() >= min && team2.getScore() > team1.getScore() + 1) {
            team2.wonSet();
            return true;
        }
        return false;
    }
    
    public int verifyTeamWonGame() {
        if (team1.getSetsWons() == 3) {
            return 1;
        }
        if (team2.getSetsWons() == 3) {
            return 2;
        }
        return 0;
    }
    
}
