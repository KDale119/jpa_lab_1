package edu.mcc.codeschool.jpaday.models;

import jakarta.persistence.*;

@Entity(name = "Albums")
public class Albums {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="albumid")
    private Integer albumId;

    @Column(name="artistid")
    private Integer artistId;

    @Column(name="title")
    private String title;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
