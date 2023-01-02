package personalproject;

public class ExplosionData {
	//images for explosion animation
	private ArrayList<String> _explosionSpriteFile;
	//# of images on each sprite row
	private int _explosionRows;
	//# of images on each sprite column
	private int _explosionCols;
	
	//set default values & **instantiate array list
	public ExplosionData() {
		_explosionSpriteFile = new ArrayList<>();
		_explosionRows = 0;
		_explosionCols = 0;
	}
	
	//getters and setters
	public ArrayList<String> getExplosionSpriteFile() {
		return _explosionSpriteFile;
	}
	public void setExplosionSpriteFile(ArrayList<String> explosionSpriteFile) {
		this._explosionSpriteFile = explosionSpriteFile;
	}
	public int getExplosionRows() {
		return _explosionRows;
	}
	public void setExplosionRows(int explosionRows) {
		this._explosionRows = explosionRows;
	}
	public int getExplosionCols() {
		return _explosionCols;
	}
	public void setExplosionCols(int explosionCols) {
		this._explosionCols = explosionCols;
	}
	
	//properties separated by dashes
	public String toString() {
		return _explosionSpriteFile +"|";
	}
}
