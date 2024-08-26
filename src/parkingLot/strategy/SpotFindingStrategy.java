package parkingLot.strategy;

import parkingLot.data.EntryPoint;
import parkingLot.data.ParkingSpot;

import java.util.List;

public interface SpotFindingStrategy {
    ParkingSpot findParkingSpot(EntryPoint entryPoint, List<ParkingSpot> parkingSpotList);
}
