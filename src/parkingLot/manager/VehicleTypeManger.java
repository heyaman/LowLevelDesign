package parkingLot.manager;

import parkingLot.data.EntryPoint;
import parkingLot.data.ParkingSpot;
import parkingLot.strategy.SpotFindingStrategy;
import java.util.List;

public interface VehicleTypeManger {
    List<ParkingSpot> findParkingSpot();

}
