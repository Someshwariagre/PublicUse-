package com.xworkz.repository;



import java.util.List;

import com.xworkz.games.GamesDTO;

public interface GameRpository {
	public boolean save(GamesDTO dto);

	public List<GamesDTO> read();

	public List<GamesDTO> findByName(String name);

	public GamesDTO updategameNameByIndex(String name, int index);

	public List<GamesDTO> deleteByIndex(int index);

	public GamesDTO updatenoOfPlayerByName(String name, int noOfPlayers);

	public List<GamesDTO> deletelocationByName(String location, String name);



}
