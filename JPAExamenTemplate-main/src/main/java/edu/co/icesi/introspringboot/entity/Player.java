package edu.co.icesi.introspringboot.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String position;

    @Column(name = "fifa_score")
    private Integer fifaScore;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @JsonIgnore
    @OneToMany(mappedBy = "player")
    private List<PlayerClub> playerClubs;

    public Player(String name, LocalDate birthDate, String position, Integer fifaScore, Country country) {
        this.name = name;
        this.birthDate = birthDate;
        this.position = position;
        this.fifaScore = fifaScore;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getFifaScore() {
        return fifaScore;
    }

    public void setFifaScore(Integer fifaScore) {
        this.fifaScore = fifaScore;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<PlayerClub> getPlayerClubs() {
        return playerClubs;
    }

    public void setPlayerClubs(List<PlayerClub> playerClubs) {
        this.playerClubs = playerClubs;
    }

}
