package parkingLot;

public class Car extends Vehicle{
	Car(String licensePlate){
		this.vehicleType = VehicleType.CAR;
		this.spotSize =  SpotSize.MEDIUM;
		this.licensePlate = licensePlate;
	}
}
