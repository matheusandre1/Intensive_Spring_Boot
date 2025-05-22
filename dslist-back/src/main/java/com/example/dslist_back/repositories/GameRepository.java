package com.example.dslist_back.repositories;

import com.example.dslist_back.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
