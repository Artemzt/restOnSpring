package hello.ffu;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Leagues {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String teamName;
    private String teamCity;
    private int foundationYear;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", title='" + teamName + '\'' +
                ", content='" + teamCity + '\'' +
                ", content='" + foundationYear +
                '}';
    }
}
