package parkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parking {
	private HashMap<Integer , ParkingSpot> parkingTicket;
	private static int ticketId = -1;
	private final int noOfLevels = 5;
	private static List<Level> levels;
	
	Parking(){
		levels = new ArrayList<Level>(noOfLevels);
		parkingTicket = new HashMap<>();
	}
	
	public int parkVehicle(Vehicle vehicle){
		for(Level level : levels){
			if(level.parkInAvailableSpot(vehicle)!=null){
				ticketId ++;
				parkingTicket.put(ticketId, level.parkInAvailableSpot(vehicle));
				return ticketId;
			}
		}
		System.out.println("Parking Full");
		return -1;	
	}
	
	public Vehicle UnParkVehicle(int ticketId){
		ParkingSpot parkingSpot = parkingTicket.get(ticketId);
		Vehicle vehicle = parkingSpot.getVehicle();
		parkingSpot.getLevel().freeSpot(parkingSpot);
		return vehicle;
	}
}
