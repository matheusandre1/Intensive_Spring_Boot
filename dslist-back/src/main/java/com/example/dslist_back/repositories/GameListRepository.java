package com.example.dslist_back.repositories;

import com.example.dslist_back.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
