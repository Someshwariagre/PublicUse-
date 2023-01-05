package com.xworkz.service;

import java.util.List;

import com.xworkz.games.GamesDTO;
import com.xworkz.repository.GameRepositoryIMPL;
import com.xworkz.repository.GameRpository;

public class GameServiceIMPL implements GameService {
	GameRpository repo=new GameRepositoryIMPL();

	@Override
	public boolean save(GamesDTO dto) {
		boolean gd =repo.save(dto);
		return true;
	}

	@Override
	public List<GamesDTO> read() {
		return repo.read();
	}

	@Override
	public List<GamesDTO> findByName(String name) {
		return	repo.findByName(name);
		 
	}

	@Override
	public GamesDTO updategameNameByIndex(String name, int index) {
		if(name!=null  && index>=0) {	
			System.out.println("Sending to repository for updatation");
			}
			return	repo.updategameNameByIndex(name,index);
	}

	@Override
	public GamesDTO deleteByIndex(int index) {
		if(index>=0) {
			List<GamesDTO> delete=repo.deleteByIndex(index);
		}
		
	return null;
	}

	@Override
	public boolean updatenoOfPlayerByName(String name, int noOfPlayers) {
		if(name !=null && name.length()>=2) {
				repo.updatenoOfPlayerByName(name, noOfPlayers);
				return true;
			}
		return false;
			}

	@Override
	public List<GamesDTO> deletelocationByName(String location, String name) {
		if( name!=null) {
			List<GamesDTO> delete1=repo.deletelocationByName(location,name);
		}
				return null;
	}

}
