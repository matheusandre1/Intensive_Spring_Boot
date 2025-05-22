package com.example.dslist_back.services;

import com.example.dslist_back.dto.GameMinDto;
import com.example.dslist_back.entities.Game;
import com.example.dslist_back.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll()
    {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }
}
