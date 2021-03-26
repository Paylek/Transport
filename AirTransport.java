package vechicles;

public abstract class AirTransport extends Transport{
    protected int wingspan;
    protected int minRunway;

    public AirTransport(int power, int maximumSpeed, int weight, String brand,
                        int wingspan, int minRunway) {
        super(power, maximumSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }

    public abstract int powerInKilowatts(int power);

}
