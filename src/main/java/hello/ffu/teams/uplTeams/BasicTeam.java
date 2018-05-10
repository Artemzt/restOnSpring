package hello.ffu.teams.uplTeams;

public abstract class BasicTeam {

    private String teamName;
    private String teamCity;
    private int foundationYear;
    private int id;

    public BasicTeam() {
    }


    public abstract String getTeamCity();

    public abstract String getTeamName();

    public abstract int getFoundationYear();

    public abstract int getId();
}

