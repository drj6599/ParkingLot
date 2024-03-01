package ParkingLot.service.startegy.SpotAllocationStrategy;

import ParkingLot.model.enums.SASTypes;

public class SpotAllocationStrategyFactory {
    public static SpotAllocationStrategy getSpotAllocationStrategy(SASTypes sasTypes)
    {
        switch (sasTypes)
        {
            case LINEAR -> {
                return new LinearSpotAllocationStrategy();
            }
            case RANDOM -> {
                return new RandomSpotAllocationStrategy();
            }
            case NEAR_TO_EXIT -> {
                return new NearestToExitSpotAllocationStrategy();
            }
            default -> {
                return null;
            }
        }
    }
}
