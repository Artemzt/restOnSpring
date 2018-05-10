package hello.ffu;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamsRepository extends JpaRepository<PremierLeague, Integer> {

    // custom query to search to blog post by title or content
    List<PremierLeague> findByTitleContainingOrContentContaining(String text, String textAgain);
}
