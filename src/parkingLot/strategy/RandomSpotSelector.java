package parkingLot.strategy;

import parkingLot.data.EntryPoint;
import parkingLot.data.ParkingSpot;

import java.util.List;

public class RandomSpotSelector implements SpotFindingStrategy {




    @Override
    public ParkingSpot findParkingSpot(EntryPoint entryPoint, List<ParkingSpot> parkingSpotList) {
        return parkingSpotList.get(0);
    }
}
