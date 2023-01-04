package personalproject;

import java.util.ArrayList;

public class GamerProfileCollection {
	//gamer profiles input and output files(not sure if this should be an array list tbh)
	private ArrayList<String> fileName;
	//current user
	private GamerProfile selectedProfile;
	//user with highest game score
	private GamerProfile highGameProfile;
	//all user profiles
	private ArrayList<GamerProfile> gamerProfiles;
	
	public GamerProfileCollection() {
		//give array list methods
		fileName = new ArrayList<>();
		gamerProfiles = new ArrayList<>();
	}
	
	public ArrayList<String> getFileName() {
		return fileName;
	}
	public void setFileName(ArrayList<String> fileName) {
		this.fileName = fileName;
	}
	public GamerProfile getSelectedProfile() {
		return selectedProfile;
	}
	public void setSelectedProfile(GamerProfile selectedProfile) {
		this.selectedProfile = selectedProfile;
	}
	public GamerProfile getHighGameProfile() {
		return highGameProfile;
	}
	public void setHighGameProfile(GamerProfile highGameProfile) {
		this.highGameProfile = highGameProfile;
	}
	public ArrayList<GamerProfile> getGamerProfiles() {
		return gamerProfiles;
	}
	public void setGamerProfiles(ArrayList<GamerProfile> gamerProfiles) {
		this.gamerProfiles = gamerProfiles;
	}
	
	public String toString() {
		return gamerProfiles + "|";
	}
}
