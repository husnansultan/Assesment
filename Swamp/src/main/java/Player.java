
public class Player {
	
	private int locationPX;
	private int locationPY;
	
	public Player(int locationPX, int locationPY ) {
		
		this.locationPX = (locationPX);
		this.locationPY = (locationPY);
	}

	public int getLocationPY() {
		return locationPY;
	}

	public void setLocationPY(int locationPY) {
		this.locationPY = locationPY;
	}

	public int getLocationPX() {
		return locationPX;
	}

	public void setLocationPX(int locationPX) {
		this.locationPX = locationPX;
	}
}
