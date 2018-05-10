package hello.ffu.teams.uplTeams;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ZoriaLuhansk extends BasicTeam{

    private String teamName = "Zoria";
    private String teamCity = "Luhansk";
    private int foundationYear = 1922;
    private int id = 3;

    public ZoriaLuhansk() {
    }


    public String getTeamName() {
        return teamName;
    }


    public String getTeamCity() {
        return teamCity;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    @JsonIgnore
    public int getId() {
        return id;
    }
}
