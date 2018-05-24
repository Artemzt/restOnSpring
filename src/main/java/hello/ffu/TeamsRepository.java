package hello.ffu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamsRepository extends CrudRepository<PremierLeague, Long> {

    // custom query to search to blog post by title or content
    //List<PremierLeague> findByTitleContainingOrContentContaining(String text, String textAgain);
}
