package edu.mcc.codeschool.jpaday.controllers;

import edu.mcc.codeschool.jpaday.models.AlbumsRequest;
import edu.mcc.codeschool.jpaday.services.AlbumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/albums")
public class AlbumsController {
    private final AlbumService albumService;

    public AlbumsController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @PostMapping()
    public ResponseEntity<AlbumsRequest> createAlbum(@RequestBody AlbumsRequest request){
        return albumService.createAlbum(request);
    }
}
