package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String ten = null;
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

  /*  @RequestMapping("/upl_clubs")
    public PremierLeague premierLeague() {
        return new PremierLeague();
    }*/

 /*   @RequestMapping("/upl_clubs")
    public PremierLeague premierLeague(@RequestParam(value = "clubId", required = false) int id) {
         return new PremierLeague(id);
    }

    @RequestMapping("/upl_clubs/1")
    public BasicTeam shakhtarDonetsk() {
        return new ShakhtarDonetsk();
    }*/
}
