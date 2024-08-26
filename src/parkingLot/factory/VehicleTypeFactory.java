package parkingLot.factory;
//
//import parkingLot.manager.VehicleTypeManger;

import parkingLot.data.VehicleType;
import parkingLot.manager.BulkyVehicleManger;
import parkingLot.manager.FourWheelerManger;
import parkingLot.manager.TwoWheelerManger;
import parkingLot.manager.VehicleTypeManger;

import static parkingLot.data.VehicleType.*;

public class VehicleTypeFactory {
    private VehicleTypeFactory(){};
    public static VehicleTypeManger getVehicleTypeManger(VehicleType vehicleType){
        if(vehicleType.equals(TWO_WHEELER)){
            return new TwoWheelerManger();
        } else if (vehicleType.equals(FOUR_WHEELER)) {
            return new FourWheelerManger();
        } else if (vehicleType.equals(BIG_VEHICLE)) {
            return new BulkyVehicleManger();

        }
        return null;

    }
}
