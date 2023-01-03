package com.xworkz.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.games.GamesDTO;

public class GameRepositoryIMPL implements GameRpository {
	List<GamesDTO> repo =new ArrayList<GamesDTO>();


	@Override
	public boolean save(GamesDTO dto) {
		System.out.println("data is saved");
		repo.add(dto);
		System.out.println("data is added");
		return true;
		
	}

	@Override
	public List<GamesDTO> read() {
		System.out.println("reading of data");
		return repo;
	}

	@Override
	public List<GamesDTO> findByName(String name) {
		if(name!=null) {
			for(GamesDTO game:repo) {
				if(game.getGameName().equals(name)){
					System.out.println(game);
					return repo;
				}
				
			}
		}
		return null;
	}

	@Override
	public GamesDTO updategameNameByIndex(String name, int index) {
		GamesDTO game1=repo.get(index);
		game1.setGameName(name);
		if(game1.getGameName().equals(name)) {
			System.out.println(game1);
		}
		return null;
	}

	@Override
	public List<GamesDTO> deleteByIndex(int index) {
		System.out.println("delete the data ");
		repo.remove(index);
		return repo;
	}

	@Override
	public GamesDTO updatenoOfPlayerByName(String name, int noOfPlayers) {
		for(int i = 0;i <repo.size();i++) {
			GamesDTO dto=repo.get(i);
			if(dto.getGameName().equals(name)) {
				dto.setGameName(name);
				dto.setNoOfPlayer(noOfPlayers);
				repo.set(i, dto);
				return dto;
			}
		}
		
		return null;
	}

	@Override
	public List<GamesDTO> deletelocationByName(String location, String name) {
		Iterator<GamesDTO> itr =repo.iterator();
		
		while(itr.hasNext()) {
			GamesDTO gamedto =itr.next();
			 if(gamedto.getGameName().equals(name)) {
				 repo.remove(gamedto);
				 System.out.println("data is deleted");
			 }
		}
			return null;
	}

}
