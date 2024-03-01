package edu.mcc.codeschool.jpaday.services;

import edu.mcc.codeschool.jpaday.models.Tracks;
import edu.mcc.codeschool.jpaday.repos.EmployeeRepository;
import edu.mcc.codeschool.jpaday.repos.TracksRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TracksService {
    private final TracksRepository tracksRepository;

    public TracksService(TracksRepository tracksRepository) {
        this.tracksRepository = tracksRepository;
    }

    public ResponseEntity<List<Tracks>> getTracksGenre(Integer genreId){
        return ResponseEntity.ok(tracksRepository.findByGenreId(genreId));
    }
}
