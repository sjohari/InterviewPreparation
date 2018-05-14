package parkingLot;

public class Bus extends Vehicle{
	Bus(String licensePlate){
		this.vehicleType = VehicleType.BUS;
		this.spotSize =  SpotSize.LARGE;
		this.licensePlate = licensePlate;
	}
}
