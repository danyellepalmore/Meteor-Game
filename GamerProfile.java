package personalproject;

public class GamerProfile {
	private String firstName;
	private String lastName;
	//in game name
	private int gamerId;
	private int gamerRank;
	private int gamesPlayed;
	//total torpedoes fired
	private int torpedoesFired;
	//total meteors hit by torpedoes
	private int meteorsHit;
	private int highScore;
	//total points from user
	private int totalScore;
	
	public GamerProfile() {
		firstName = null;
		lastName = null;
		gamerId = 0;
		gamerRank = 0;
		gamesPlayed = 0;
		torpedoesFired = 0;
		meteorsHit = 0;
		highScore = 0;
		totalScore = 0;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public int getGamerRank() {
		return gamerRank;
	}
	public void setGamerRank(int gamerRank) {
		this.gamerRank = gamerRank;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public int getTorpedoesFired() {
		return torpedoesFired;
	}
	public void setTorpedoesFired(int torpedoesFired) {
		this.torpedoesFired = torpedoesFired;
	}
	public int getMeteorsHit() {
		return meteorsHit;
	}
	public void setMeteorsHit(int meteorsHit) {
		this.meteorsHit = meteorsHit;
	}
	public int getHighScore() {
		return highScore;
	}
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return firstName + "|" + lastName +"|";
	}
}
