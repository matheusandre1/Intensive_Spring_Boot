package com.example.dslist_back.services;

import com.example.dslist_back.dto.GameDto;
import com.example.dslist_back.dto.GameMinDto;
import com.example.dslist_back.entities.Game;
import com.example.dslist_back.entities.GameList;
import com.example.dslist_back.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll()
    {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long gameId){
        Game result = gameRepository.findById(gameId).get();
        return new GameDto(result);
    }
}
