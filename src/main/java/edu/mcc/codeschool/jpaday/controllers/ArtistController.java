package edu.mcc.codeschool.jpaday.controllers;

import edu.mcc.codeschool.jpaday.models.Artists;
import edu.mcc.codeschool.jpaday.services.ArtistService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/artists")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/joinLists")
    public ResponseEntity<List<Artists>> joinList(){
        return artistService.joinList();
    }
}
