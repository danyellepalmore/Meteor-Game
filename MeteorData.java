package personalproject;

import java.util.ArrayList;

public class MeteorData {
	//meteor images
	private ArrayList<String> _meteorSpriteFile;
	//minimum pixel width and height of meteor
	private int _minSize;
	//# of meteor images in each column of sprite sheet
	private int _meteorCols;
	//# of meteor images in each row on sprite sheet
	private int _meteorRows;
	//default max speed of meteor
	private double _maxSpeed;
	
	public MeteorData() {
		_meteorSpriteFile = new ArrayList<>();
		_minSize = 0;
		_meteorCols = 0;
		_meteorRows = 0;
		_maxSpeed = 0.0;
	}

	public ArrayList<String> getMeteorSpriteFile() {
		return _meteorSpriteFile;
	}
	public void setMeteorSpriteFile(ArrayList<String> meteorSpriteFile) {
		this._meteorSpriteFile = meteorSpriteFile;
	}
	public int getMinSize() {
		return _minSize;
	}
	public void setMinSize(int minSize) {
		this._minSize = minSize;
	}
	public int getMeteorCols() {
		return _meteorCols;
	}
	public void setMeteorCols(int meteorCols) {
		this._meteorCols = meteorCols;
	}
	public int getMeteorRows() {
		return _meteorRows;
	}
	public void setMeteorRows(int meteorRows) {
		this._meteorRows = meteorRows;
	}
	public double getMaxSpeed() {
		return _maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed) {
		this._maxSpeed = maxSpeed;
	}
	
	public String toString() {
		return _meteorSpriteFile + "|";
	}
}
