package hello.ffu;


import java.util.*;

public class PremierLeague {

    private String [] uplTeams = {"Shakhtar (Donetsk)", "Dynamo (Kiev)", "Zoria (Luhansk)", "Olympic (Donetsk)"};
    private String [] pfl1Teams = {"Arsenal (Kiev)", "FC Poltava", "Ingulets (Petrovo)"};
    private String baseUplUrl = "http://localhost:8080/upl_clubs/";
    private TreeMap<String, String> urlForEachTeam = initializeTeamMap(baseUplUrl, uplTeams);

    public PremierLeague() {
    }


    public String[] getUplTeams() {
       return uplTeams;
    }


    public TreeMap<String, String> initializeTeamMap(String url, String[] teams) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        for (int i = 0; i < teams.length; i++) {
            treeMap.put(teams[i], url+(i+1));
        }
        return treeMap;
    }



    public TreeMap<String, String> getUrlForEachTeam() {
        return urlForEachTeam;
    }





}
