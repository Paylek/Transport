package vechicles;

public abstract class LandTransport extends Transport{
    protected int numberOfWheels;
    protected int fuelConsumption;


    public LandTransport(int power, int maximum_speed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maximum_speed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract int powerInKilowatts(int power);
}
