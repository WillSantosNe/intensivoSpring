package com.intensivo.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intensivo.dslist.dto.GameMinDTO;
import com.intensivo.dslist.entities.Game;
import com.intensivo.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<Game> findAll() {
		List<Game> result = gameRepository.findAll();
		return result;
	}

}
