package personalproject;

import java.util.ArrayList;

public class CraftData {
	//images for space craft
	private ArrayList<String> imageFiles;
	//sound file when fired
	private String _phaserSoundFile;
	//speed increase when accelerate button is pressed
	private double _thrustIncreaseAmount;
	//decrease when accelerate button is released
	private double _thrustDecreaseAmount;
	private double _maxSpeed;
	
	public void CraftData(){
		//Initialize properties to Java defaults and instantiate the ArrayList
		imageFiles = new ArrayList<>();
		_phaserSoundFile = null;
		_thrustIncreaseAmount = 0.0;
		_thrustDecreaseAmount = 0.0;
		_maxSpeed = 0.0;
	}
	
	public String get_phaserSoundFile() {
		return _phaserSoundFile;
	}
	public void set_phaserSoundFile(String _phaserSoundFile) {
		this._phaserSoundFile = _phaserSoundFile;
	}
	public double get_thrustIncreaseAmount() {
		return _thrustIncreaseAmount;
	}
	public void set_thrustIncreaseAmount(double _thrustIncreaseAmount) {
		this._thrustIncreaseAmount = _thrustIncreaseAmount;
	}
	public double get_thrustDecreaseAmount() {
		return _thrustDecreaseAmount;
	}
	public void set_thrustDecreaseAmount(double _thrustDecreaseAmount) {
		this._thrustDecreaseAmount = _thrustDecreaseAmount;
	}
	public double get_maxSpeed() {
		return _maxSpeed;
	}
	public void set_maxSpeed(double _maxSpeed) {
		this._maxSpeed = _maxSpeed;
	}
	
	public String toString() {
		return _phaserSoundFile + "|";
	}
}
