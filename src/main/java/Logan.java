public class Logan extends Dacia {
    private final double fuelTankSize = 50;
    private final FuelType fuelType = FuelType.PETROL;

    public Logan (double fuel, String chassisNumber){
        super.availableFuel = fuel;
        super.tireSize = 15;
        super.maxTireSize = 18;
        super.maxGears = 5;
        super.consumptionPer100km = 6.0;
        super.gearEfficiencyCoefficient = 0.05;
        super.tireEfficiencyCoefficient = 0.03;
        super.chassisNumber = chassisNumber;
    }
}
