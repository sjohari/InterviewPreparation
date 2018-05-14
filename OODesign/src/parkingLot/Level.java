package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Level {
	private int floorNumber;
	private List<ParkingSpot> parkingSpots;
	private final int numberOfSpots = 4;
	private int availableSpots;
	
	Level(int floorNumber){
		this.floorNumber = floorNumber;
		parkingSpots = new ArrayList<ParkingSpot>(numberOfSpots);
		this.availableSpots = numberOfSpots;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}

	public List<ParkingSpot> getParkingSpots() {
		return parkingSpots;
	}
	
	public void addParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpots.add(parkingSpot);
	}
	
	boolean isLevelFull(){
		if(availableSpots==0){
			return false;
		}
		return true;
	}
	
	public ParkingSpot parkInAvailableSpot(Vehicle vehicle){
		for(ParkingSpot parkingSpot : parkingSpots){
			if(parkingSpot.isAvailable() && parkingSpot.getSize().equals(vehicle.spotSize)){
				parkingSpot.setVehicle(vehicle);
				parkingSpot.markUnAvailable();
				vehicle.parkingSpot = parkingSpot;
				availableSpots = availableSpots - 1;
				return parkingSpot;
			}
		}
		return null;
	}

	public void freeSpot(ParkingSpot parkingSpot) {
		availableSpots++;
		parkingSpot.markAvailable();
		parkingSpot.removeVehicle();
	}
	
}
