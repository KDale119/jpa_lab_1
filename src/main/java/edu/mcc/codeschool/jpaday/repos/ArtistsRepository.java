package edu.mcc.codeschool.jpaday.repos;

import edu.mcc.codeschool.jpaday.models.Albums;
import edu.mcc.codeschool.jpaday.models.Artists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistsRepository extends JpaRepository<Artists, Integer> {
}
