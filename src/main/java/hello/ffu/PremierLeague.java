package hello.ffu;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

@Entity
public class PremierLeague extends Leagues{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*private String [] uplTeams = {"Shakhtar (Donetsk)", "Dynamo (Kiev)", "Zoria (Luhansk)", "Olympic (Donetsk)"};
    private String [] pfl1Teams = {"Arsenal (Kiev)", "FC Poltava", "Ingulets (Petrovo)"};
    private String baseUplUrl = "http://localhost:8080/upl_clubs/";
    private TreeMap<String, String> urlForEachTeam = initializeTeamMap(baseUplUrl, uplTeams);*/

    private String teamName;
    private String teamCity;
    private int foundationYear;

    public PremierLeague() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public void setTeamCity(String teamCity) {
        this.teamCity = teamCity;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

   /* public String[] getUplTeams() {
       return uplTeams;
    }*/

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", title='" + teamName + '\'' +
                ", content='" + teamCity + '\'' +
                ", content='" + foundationYear +
                '}';
    }


/*    public TreeMap<String, String> initializeTeamMap(String url, String[] teams) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        for (int i = 0; i < teams.length; i++) {
            treeMap.put(teams[i], url+(i+1));
        }
        return treeMap;
    }*/



  /*  public TreeMap<String, String> getUrlForEachTeam() {
        return urlForEachTeam;
    }*/





}
