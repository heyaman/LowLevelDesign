package parkingLot.api;

import parkingLot.data.VehicleType;
import parkingLot.manager.VehicleTypeManger;

public class findParkingSlot {




    public ParkingSlot findParkingSlot(EntryPoint entryPoint, VehicleType vehicleType, SlotFindingStrategy slotFindingStrategy) {

       return vehicleTypeManger.findParkingSpot(entryPoint, slotFindingStrategy);
    }

}
