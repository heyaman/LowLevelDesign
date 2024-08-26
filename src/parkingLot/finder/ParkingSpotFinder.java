package parkingLot.finder;

import parkingLot.data.EntryPoint;
import parkingLot.data.ParkingSpot;
import parkingLot.manager.VehicleTypeManger;
import parkingLot.strategy.SpotFindingStrategy;
import java.util.List;

public class ParkingSpotFinder {
    private final VehicleTypeManger vehicleTypeManger;
    private final SpotFindingStrategy spotFindingStrategy;
    private final EntryPoint entryPoint;

    public ParkingSpotFinder(EntryPoint entryPoint, VehicleTypeManger vehicleTypeManger, SpotFindingStrategy spotFindingStrategy) {
        this.vehicleTypeManger = vehicleTypeManger;
        this.spotFindingStrategy = spotFindingStrategy;
        this.entryPoint=entryPoint;
    }

    public ParkingSpot getParkingSpot(){
        List<ParkingSpot>parkingSpotList=this.vehicleTypeManger.findParkingSpot();
       return this.spotFindingStrategy.findParkingSpot(this.entryPoint, parkingSpotList);

    }
}
