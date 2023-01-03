package com.xworkz.service;

import java.util.List;

import com.xworkz.games.GamesDTO;

public interface GameService {
	public boolean save(GamesDTO dto);

	public List<GamesDTO> read();

	public List<GamesDTO> findByName(String name);

	public GamesDTO updategameNameByIndex(String name, int index);

	public GamesDTO deleteByIndex(int index);

	public boolean updatenoOfPlayerByName(String name, int noOfPlayers);

	public List<GamesDTO> deletelocationByName(String location, String name);


}
