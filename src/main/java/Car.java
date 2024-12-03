enum FuelType {
    PETROL, DIESEL
}

public abstract class Car implements Vehicle {
    public double distanceTraveled = 0;
    protected double fuelUsed = 0;
    protected int gear = 0;
    protected int maxGears;
    protected double consumptionPer100km;
    public double availableFuel;
    public int tireSize;
    protected int maxTireSize;
    protected double gearEfficiencyCoefficient = 6.0;
    protected double tireEfficiencyCoefficient;
    public String chassisNumber;

    /**
     * on every start the consumption stats are reset
     */
    public void start() {
        this.distanceTraveled = 0;
        this.fuelUsed = 0;
    }

    /**
     * on every stop the car computes how much it has consumed
     */
    public void stop() {
        double fuel = (this.distanceTraveled / 100) * consumptionPer100km;

        double gearEfficiency = (this.maxGears - this.gear) * gearEfficiencyCoefficient;

        double tireEfficiency = (this.maxTireSize - this.tireSize) * tireEfficiencyCoefficient;
        this.fuelUsed = fuel + (fuel * gearEfficiency) + (fuel * tireEfficiency);
        this.availableFuel -= this.fuelUsed;
    }

    /**
     * a car can be driven for N kms in different gears
     * @param distance value in kilometers
     */
    public void drive(double distance) {
        this.distanceTraveled += distance;
    }

    /**
     * @param gear the gear number
     */
    public void shiftGear(int gear) {
        if (gear >= 0 && gear <= this.maxGears) {
            this.gear = gear;
        }
    }

    /**
     * @return available fuel in liters
     */
    public double getAvailableFuel() {
        return this.availableFuel;
    }

    /**
     * @return average fuel consumption in liters/100km
     */
    public double getAverageFuelConsumption() {
        System.out.println("distanceTraveled " + this.distanceTraveled);
        System.out.println("fuelUsed "+ this.fuelUsed);
        return (this.fuelUsed / this.distanceTraveled) * 100;
    }
}
