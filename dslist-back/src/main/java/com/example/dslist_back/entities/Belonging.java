package com.example.dslist_back.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BeLonginPK id = new BeLonginPK();

    private Integer position;

    public Belonging(){

    }

    public Belonging(Game game, GameList gameList, Integer position) {
        this.id.setGame(game);
        this.id.setGameList(gameList);
        this.position = position;
    }

    public BeLonginPK getId() {
        return id;
    }

    public void setId(BeLonginPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
