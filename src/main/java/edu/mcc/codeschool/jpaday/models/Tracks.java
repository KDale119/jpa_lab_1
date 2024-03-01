package edu.mcc.codeschool.jpaday.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "Tracks")
public class Tracks {
    @Id
    @Column(name="trackid")
    private Integer trackId;

    @Column(name="name")
    private String name;

    @Column(name="genreid")
    private Integer genreId;

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }


}
