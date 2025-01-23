package com.devsuperior.dslits.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslits.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
