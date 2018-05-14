package parkingLot;

public class ParkingSpot {
	private Vehicle vehicle;
	private boolean available;
	private SpotSize size;
	private Level level;
	private int spotNumber;
	
	ParkingSpot(SpotSize size ,Level level , int spotNumber ){
		this.size = size;
		this.level = level;
		this.spotNumber = spotNumber;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public SpotSize getSize() {
		return size;
	}

	public void setSize(SpotSize size) {
		this.size = size;
	}
	
	public void markAvailable(){
		available = true;
	}
	
	public void markUnAvailable(){
		available = false;
	}
	
	public boolean isAvailable(){
		return available;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}
	
	public void removeVehicle(){
		vehicle = null;
	}
	
}
