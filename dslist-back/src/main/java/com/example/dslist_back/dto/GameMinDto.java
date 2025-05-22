package com.example.dslist_back.dto;

import com.example.dslist_back.entities.Game;

public record GameMinDto(
        Long id,
        Integer year,
        String imgUrl,
        String shortDescription,
        String longDescription
) {
    public GameMinDto(Game entity) {
        this(
                entity.getId(),
                entity.getYear(),
                entity.getImgUrl(),
                entity.getShortDescription(),
                entity.getLongDescription()
        );
    }
}

