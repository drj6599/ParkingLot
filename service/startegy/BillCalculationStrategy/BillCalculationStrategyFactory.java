package ParkingLot.service.startegy.BillCalculationStrategy;

import ParkingLot.model.enums.BCSType;

public class BillCalculationStrategyFactory {
    public static BillCalculationStrategy getBillCalculationStrategy(BCSType bcsType)
    {
        switch (bcsType){
            case SIMPLE -> {
                return new SimpleBillCalculationStrategy();
            }
            case SURGE -> {
                return new SurgeBillCalculationStrategy();
            }
            default -> {
                return null;
            }
        }
    }

}
