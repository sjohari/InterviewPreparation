package parkingLot;

public class Motorcycle extends Vehicle{
	Motorcycle(String licensePlate){
		this.vehicleType = VehicleType.MOTORCYCLE;
		this.spotSize =  SpotSize.SMALL;
		this.licensePlate = licensePlate;
	}
}
