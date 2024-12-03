public class Main {
    public static void main(String... args) {
//        Car car = new Car(); // this should not compile.

//        Car car = new Dacia(27, "09345756"); // this should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

        Car logan = new Logan(27.0, "09345756"); // Logan can extend from Dacia, while Dacia extends from Car

        logan.start();
        logan.shiftGear(1);
        logan.drive(0.1); // drives 0.01 KMs
        logan.shiftGear(2);
        logan.drive(0.02);
        logan.shiftGear(3);
        logan.drive(0.5);
        logan.shiftGear(4);
        logan.drive(0.5);
        logan.shiftGear(4);
        logan.drive(0.5);
        logan.shiftGear(5);
        logan.drive(10);
        logan.shiftGear(4);
        logan.drive(0.5);
        logan.shiftGear(3);
        logan.drive(0.1);
        logan.stop();

        System.out.println("Dacia Logan");
        System.out.println("availableFuel: " + logan.getAvailableFuel());
        System.out.println("fuelConsumedPer100Km: " + logan.getAverageFuelConsumption());
        System.out.println();

        Car grandTurismo = new GranTurismo(50.0, "09345756");

        grandTurismo.start();
        grandTurismo.shiftGear(1);
        grandTurismo.drive(6); // drives 0.01 KMs
        grandTurismo.shiftGear(5);
        grandTurismo.drive(4);
        grandTurismo.shiftGear(7);
        grandTurismo.drive(4);
        grandTurismo.shiftGear(1);
        grandTurismo.drive(3);
        grandTurismo.stop();

        System.out.println("Masearati Grand Turismo");
        System.out.println("availableFuel: " + grandTurismo.getAvailableFuel());
        System.out.println("fuelConsumedPer100Km: " + grandTurismo.getAverageFuelConsumption());
        System.out.println();
    }
}