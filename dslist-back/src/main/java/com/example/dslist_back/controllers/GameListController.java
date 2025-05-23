package com.example.dslist_back.controllers;

import com.example.dslist_back.dto.GameListDto;
import com.example.dslist_back.dto.GameMinDto;
import com.example.dslist_back.services.GameListService;
import com.example.dslist_back.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        return gameListService.finAllLists();
    }

}
