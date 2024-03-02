package edu.mcc.codeschool.jpaday.services;

import edu.mcc.codeschool.jpaday.models.Artists;
import edu.mcc.codeschool.jpaday.repos.ArtistsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    //LAB 2
    private final ArtistsRepository artistsRepository;

    public ArtistService(ArtistsRepository artistsRepository) {
        this.artistsRepository = artistsRepository;
    }

    public ResponseEntity<List<Artists>> joinList(){
        return ResponseEntity.ok(artistsRepository.joinList());
    }
}
