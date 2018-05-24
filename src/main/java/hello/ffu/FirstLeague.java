package hello.ffu;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FirstLeague extends Leagues{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String teamName;
    private String teamCity;
    private int foundationYear;

    public FirstLeague() {
    }

    public Long getId() {
        return super.getId();
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public String getTeamName() {
        return super.getTeamName();
    }

    public void setTeamName(String teamName) {
        super.setTeamName(teamName);
    }

    public String getTeamCity() {
        return super.getTeamCity();
    }

    public void setTeamCity(String teamCity) {
        super.setTeamCity(teamCity);
    }

    public int getFoundationYear() {
        return super.getFoundationYear();
    }

    public void setFoundationYear(int foundationYear) {
        super.setFoundationYear(foundationYear);
    }
}
