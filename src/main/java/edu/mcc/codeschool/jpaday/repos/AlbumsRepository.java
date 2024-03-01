package edu.mcc.codeschool.jpaday.repos;

import edu.mcc.codeschool.jpaday.models.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumsRepository extends JpaRepository<Albums, Integer> {
}
