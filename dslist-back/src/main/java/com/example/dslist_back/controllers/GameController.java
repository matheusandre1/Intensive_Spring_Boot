package com.example.dslist_back.controllers;

import com.example.dslist_back.dto.GameDto;
import com.example.dslist_back.dto.GameMinDto;
import com.example.dslist_back.entities.Game;
import com.example.dslist_back.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll(){
        return gameService.findAll();
    }

    @GetMapping
    @RequestMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
