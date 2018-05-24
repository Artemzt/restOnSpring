package hello;

import hello.ffu.PremierLeague;
import hello.ffu.TeamsRepository;
import hello.ffu.teams.uplTeams.BasicTeam;
import hello.ffu.teams.uplTeams.DynamoKiev;
import hello.ffu.teams.uplTeams.OlympicDonetsk;
import hello.ffu.teams.uplTeams.ShakhtarDonetsk;
import hello.ffu.teams.uplTeams.ZoriaLuhansk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "/upl_clubs")
public class UPLController {

    @Autowired
    private TeamsRepository teamsRepository;

    @RequestMapping(method = GET, path = "/add")
    public @ResponseBody String addNewTeam(@RequestParam String teamName,
                                           @RequestParam String teamCity,
                                           @RequestParam int foundationYear) {
        PremierLeague pl = new PremierLeague();
        pl.setTeamName(teamName);
        pl.setTeamCity(teamCity);
        pl.setFoundationYear(foundationYear);
        teamsRepository.save(pl);
        return "Team Saved: " + pl.toString();
    }

    @RequestMapping(method = GET, path = "/allPlTeams")
    public @ResponseBody Iterable<PremierLeague> getAllTeamData() {
        return teamsRepository.findAll();
    }

    @RequestMapping(method = GET, path = "/findTeam")
    public @ResponseBody PremierLeague getTeam(@RequestParam Long id) {
        PremierLeague pl = new PremierLeague();
        pl.setId(id);
       return teamsRepository.findOne(id);
    }

    @RequestMapping(method = GET, path = "/remove")
    public @ResponseBody String removeTeam(@RequestParam Long id) {
        PremierLeague pl = new PremierLeague();
        pl.setId(id);
        teamsRepository.delete(pl);
        return "Team Removed ";
    }


   /* @RequestMapping("/upl_clubs")
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
    }*/
}
