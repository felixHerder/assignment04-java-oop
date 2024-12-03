public class GranTurismo extends Maserati {
    private final double fuelTankSize = 55;
    private final FuelType fuelType = FuelType.PETROL;

    public GranTurismo(double fuel, String chassisNumber){
        super.availableFuel = fuel;
        super.tireSize = 15;
        super.maxTireSize = 20;
        super.maxGears = 7;
        super.consumptionPer100km = 8;
        super.gearEfficiencyCoefficient = 0.005;
        super.tireEfficiencyCoefficient = 0.003;
        super.chassisNumber = chassisNumber;
    }
}
