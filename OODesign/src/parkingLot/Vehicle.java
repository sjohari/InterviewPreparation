package parkingLot;

public abstract class Vehicle {
	String licensePlate;
	VehicleType vehicleType;
	ParkingSpot parkingSpot;
	SpotSize spotSize;

	public SpotSize getSpotSize() {
		return spotSize;
	}

	public void setSpotSize(SpotSize spotSize) {
		this.spotSize = spotSize;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
}
