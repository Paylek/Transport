package vechicles;

public abstract class Transport {
    protected int power;
    protected int maximumSpeed;
    protected int weight;
    protected String  brand;



    public Transport(int power, int maximumSpeed, int weight, String brand) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public abstract int powerInKilowatts(int power);

}
