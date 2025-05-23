package com.example.dslist_back.dto;

import com.example.dslist_back.entities.Game;
import jakarta.persistence.Column;

public record GameDto(Long id,String title,Integer year, String genre,String platforms,Double score,String imgUrl,
                      String shortDescription,
                      String longDescription)
{
    public GameDto(Game entity)
    {
        this(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getGender(),
                entity.getPlatforms(),
                entity.getScore(),
                entity.getImgUrl(),
                entity.getShortDescription(),
                entity.getLongDescription()
        );
    }
}


