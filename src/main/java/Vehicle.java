public interface Vehicle {
    /**
     * starts the vehicle
     */
    public void start();


    /**
     * stops the vehicle
     */
    public void stop();

    /**
     * @param distance value in kilometers
     */
    public void drive(double distance);
}
