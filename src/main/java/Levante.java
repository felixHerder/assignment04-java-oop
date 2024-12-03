public class Levante extends Maserati {
    private final double fuelTankSize = 90;
    private final FuelType fuelType = FuelType.DIESEL;

    public Levante(double fuel, String chassisNumber){
        super.availableFuel = fuel;
        super.tireSize = 18;
        super.maxTireSize = 22;
        super.maxGears = 8;
        super.consumptionPer100km = 9.5;
        super.gearEfficiencyCoefficient = 0.009;
        super.tireEfficiencyCoefficient = 0.007;
        super.chassisNumber = chassisNumber;
    }
}
