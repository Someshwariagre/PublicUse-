package com.xworkz.games;


public class GamesDTO {
	private String gameName;
	private String gameType;
	private int noOfPlayer;
	private boolean wonTheGame;
	private String location;
	private String timing;
	
	public GamesDTO(String gameName, String gameType, int noOfPlayer, boolean wonTheGame, String location,
			String timing) {
		super();
		this.gameName = gameName;
		this.gameType = gameType;
		this.noOfPlayer = noOfPlayer;
		this.wonTheGame = wonTheGame;
		this.location = location;
		this.timing = timing;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public int getNoOfPlayer() {
		return noOfPlayer;
	}

	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}

	public boolean isWonTheGame() {
		return wonTheGame;
	}

	public void setWonTheGame(boolean wonTheGame) {
		this.wonTheGame = wonTheGame;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	@Override
	public String toString() {
		return "GamesDTO [gameName=" + gameName + ", gameType=" + gameType + ", noOfPlayer=" + noOfPlayer
				+ ", wonTheGame=" + wonTheGame + ", location=" + location + ", timing=" + timing + "]";
	}
	

}
