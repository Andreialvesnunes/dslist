package com.devsuperior.dslits.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslits.dto.GameListDTO;
import com.devsuperior.dslits.dto.GameMinDTO;
import com.devsuperior.dslits.dto.ReplacementDTO;
import com.devsuperior.dslits.services.GameListService;
import com.devsuperior.dslits.services.GameService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

	
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	@PostMapping(value = "/{listId}/replacement")
	public ResponseEntity<Void> move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
	    System.out.println("List ID: " + listId);
	    System.out.println("Request Body: " + body);
	    System.out.println("Source Index: " + body.getSourceIndex());
	    System.out.println("Destination Index: " + body.getDestinationIndex());

	    gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());

	    return ResponseEntity.ok().build(); // Retorna 200 OK sem corpo
	}
}
