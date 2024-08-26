package parkingLot.manager;

import parkingLot.data.EntryPoint;
import parkingLot.data.ParkingSpot;
import parkingLot.strategy.SpotFindingStrategy;
import java.util.List;

public class TwoWheelerManger implements VehicleTypeManger{
    @Override
    public List<ParkingSpot> findParkingSpot() {
        return null;
    }
}
