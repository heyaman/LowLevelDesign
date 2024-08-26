package parkingLot.api;

import parkingLot.data.ParkingSpot;
import parkingLot.data.SpotFindingStrategyType;
import parkingLot.data.VehicleType;
import parkingLot.data.EntryPoint;
import parkingLot.factory.VehicleTypeFactory;
import parkingLot.finder.ParkingSpotFinder;
import parkingLot.manager.VehicleTypeManger;
import parkingLot.strategy.NearestSpotSelector;
import parkingLot.strategy.RandomSpotSelector;
import parkingLot.strategy.SpotFindingStrategy;

public class findParkingSpot {




    public ParkingSpot findParkingSlot(EntryPoint entryPoint, VehicleType vehicleType, SpotFindingStrategyType spotFindingStrategyType) {

      VehicleTypeManger vehicleTypeManger= VehicleTypeFactory.getVehicleTypeManger(vehicleType);
      SpotFindingStrategy spotFindingStrategy=null;
      if(spotFindingStrategyType.equals(SpotFindingStrategyType.NEAREST)){
          spotFindingStrategy=new NearestSpotSelector();
      } else if (spotFindingStrategyType.equals(SpotFindingStrategyType.RANDOM)) {
          spotFindingStrategy=new RandomSpotSelector();

      }
        return (new ParkingSpotFinder(entryPoint, vehicleTypeManger, spotFindingStrategy)).getParkingSpot();
    }

}
