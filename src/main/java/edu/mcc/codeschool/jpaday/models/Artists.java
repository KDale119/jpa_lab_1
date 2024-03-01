package edu.mcc.codeschool.jpaday.models;

import jakarta.persistence.*;

@Entity(name = "Artists")
public class Artists {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="artistid")
    private Integer artistId;

    @Column(name = "name")
    private String name;

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
