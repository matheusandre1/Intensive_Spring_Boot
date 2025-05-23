package com.example.dslist_back.services;

import com.example.dslist_back.dto.GameListDto;
import com.example.dslist_back.dto.GameMinDto;
import com.example.dslist_back.entities.GameList;
import com.example.dslist_back.repositories.GameListRepository;
import com.example.dslist_back.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    public GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> finAllLists(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDto::new).toList();
    }
}
