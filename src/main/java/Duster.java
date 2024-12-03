public class Duster extends Dacia {
    private final double fuelTankSize = 70;
    private final FuelType fuelType = FuelType.DIESEL;

    public Duster(double fuel, String chassisNumber){
        super.availableFuel = fuel;
        super.tireSize = 17;
        super.maxTireSize = 20;
        super.maxGears = 7;
        super.consumptionPer100km = 9.0;
        super.gearEfficiencyCoefficient = 0.09;
        super.tireEfficiencyCoefficient = 0.06;
        super.chassisNumber = chassisNumber;
    }
}
