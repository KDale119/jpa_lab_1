package edu.mcc.codeschool.jpaday.controllers;

import edu.mcc.codeschool.jpaday.models.Tracks;
import edu.mcc.codeschool.jpaday.services.TracksService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/tracks")
public class TracksController {
    private final TracksService tracksService;

    public TracksController(TracksService tracksService) {
        this.tracksService = tracksService;
    }

    @GetMapping("/getTracksGenre/{genreId}")
    public ResponseEntity<List<Tracks>> getTracksGenre(@PathVariable Integer genreId){
        return tracksService.getTracksGenre(genreId);
    }
}
