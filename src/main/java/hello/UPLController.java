package hello;

import hello.ffu.PremierLeague;
import hello.ffu.teams.uplTeams.BasicTeam;
import hello.ffu.teams.uplTeams.DynamoKiev;
import hello.ffu.teams.uplTeams.OlympicDonetsk;
import hello.ffu.teams.uplTeams.ShakhtarDonetsk;
import hello.ffu.teams.uplTeams.ZoriaLuhansk;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UPLController {

    @RequestMapping("/upl_clubs")
    public PremierLeague premierLeague() {
        return new PremierLeague();
    }

    @RequestMapping("/upl_clubs/1")
    public BasicTeam shakhtarDonetsk() {
        return new ShakhtarDonetsk();
    }

    @RequestMapping("/upl_clubs/2")
    public BasicTeam dynamoKiev() {
        return new DynamoKiev();
    }

    @RequestMapping("/upl_clubs/3")
    public BasicTeam zoriaLuhansk() {
        return new ZoriaLuhansk();
    }

    @RequestMapping("/upl_clubs/4")
    public BasicTeam olympicDonetsk() {
        return new OlympicDonetsk();
    }
}
