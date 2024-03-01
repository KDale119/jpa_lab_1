package edu.mcc.codeschool.jpaday.repos;

import edu.mcc.codeschool.jpaday.models.Tracks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TracksRepository extends JpaRepository<Tracks, Integer> {

//    @Query(value = "Select * from Tracks where genreId = 1")
    List<Tracks> findByGenreId(Integer genreId);
}

