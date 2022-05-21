package Model;

/**
 * Modelo referente à Entidade Time
 * 
 * @author Maria Eduarda Buzana
 */
public class Team {

    private int score;
    private int setsWons;
    private String name;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore() {
        this.score++;
    }

    public void subScore() {
        if (this.score > 0) {
            this.score--;
        }
    }

    public int getSetsWons() {
        return setsWons;
    }

    public void setSetsWons(int setsWons) {
        this.setsWons = setsWons;
    }

    public void wonSet() {
        setsWons++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
