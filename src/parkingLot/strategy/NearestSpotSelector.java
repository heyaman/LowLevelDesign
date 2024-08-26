package parkingLot.strategy;

import parkingLot.data.EntryPoint;
import parkingLot.data.ParkingSpot;
import java.util.*;

public class NearestSpotSelector implements SpotFindingStrategy {




    @Override
    public ParkingSpot findParkingSpot(EntryPoint entryPoint, List<ParkingSpot> parkingSpotList) {
       return parkingSpotList.get(0);
    }
}
