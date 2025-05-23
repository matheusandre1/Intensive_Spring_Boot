package com.example.dslist_back.dto;

import com.example.dslist_back.entities.Game;
import com.example.dslist_back.entities.GameList;

public record GameListDto(Long id, String name) {

    public GameListDto(GameList entity)
    {
        this(
                entity.getId(),
                entity.getName()
        );
    }
}
