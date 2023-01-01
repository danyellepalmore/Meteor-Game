package personalproject;

public class ExplosionData {
	//images for explosion animation
	private String explosionSpriteFile;
	//# of images on each sprite row
	private int explosionRows;
	//# of images on each sprite column
	private int explosionCols;
	
	//set default values & **instantiate array list
	public ExplosionData() {
		explosionSpriteFile = null;
		explosionRows = 0;
		explosionCols = 0;
	}
	
	//getters and setters
	public String getExplosionSpriteFile() {
		return explosionSpriteFile;
	}
	public void setExplosionSpriteFile(String explosionSpriteFile) {
		this.explosionSpriteFile = explosionSpriteFile;
	}
	public int getExplosionRows() {
		return explosionRows;
	}
	public void setExplosionRows(int explosionRows) {
		this.explosionRows = explosionRows;
	}
	public int getExplosionCols() {
		return explosionCols;
	}
	public void setExplosionCols(int explosionCols) {
		this.explosionCols = explosionCols;
	}
	
	//properties separated by dashes
	public String toString() {
		return explosionSpriteFile +"|";
	}
}
