package edu.mcc.codeschool.jpaday.services;

import edu.mcc.codeschool.jpaday.models.Albums;
import edu.mcc.codeschool.jpaday.models.AlbumsRequest;
import edu.mcc.codeschool.jpaday.models.Artists;
import edu.mcc.codeschool.jpaday.repos.AlbumsRepository;
import edu.mcc.codeschool.jpaday.repos.ArtistsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AlbumService {
    private final AlbumsRepository albumsRepository;
    private final ArtistsRepository artistsRepository;

    public AlbumService(AlbumsRepository albumsRepository, ArtistsRepository artistsRepository) {
        this.albumsRepository = albumsRepository;
        this.artistsRepository = artistsRepository;
    }

    public ResponseEntity<AlbumsRequest> createAlbum(AlbumsRequest request) {
        Artists artists = new Artists();
        artists.setName(request.getArtist());
        artists = artistsRepository.save(artists);

        Albums albums = new Albums();
        albums.setTitle(request.getTitle());
        albums.setArtistId(artists.getArtistId());
        albums = albumsRepository.save(albums);

        request.setAlbumId(albums.getAlbumId());
        request.setArtistId(artists.getArtistId());
        return ResponseEntity.ok(request);
    }
//    public Void deleteAlbum(Integer albumId){
//        Albums albums = albumsRepository.findById(albumId).get();
//        albumsRepository.delete(albums);
//    }
}
