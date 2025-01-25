package com.devsuperior.dslits.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslits.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
