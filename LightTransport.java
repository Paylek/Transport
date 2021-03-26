package vechicles;

import java.util.Scanner;

public class LightTransport extends LandTransport{
    private final String bodyType;
    private final int numberOfPassengers;


    public LightTransport(int power, int maximumSpeed, int weight, String brand, int numberOfWheels,
                          int fuelConsumption, String bodyType, int numberOfPassengers) {

        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void printInfo (LightTransport str) {
        System.out.println("Мощность " + str.power +  " лошадиных сил, Максимальная скорость " + str.maximumSpeed +
                "км/ч, Масса " + str.weight + " кг, Бренд " +  str.brand + " Количество колес " + str.numberOfWheels +
                " Расход топлива " + str.fuelConsumption +
                " (литр/100км), Тип кузова " + str.bodyType +
                " Количество пассажиров " + str.numberOfPassengers + " Мощность в килловатах " + powerInKilowatts(power));
    }

    @Override
    public int powerInKilowatts(int power) {
        power *= 0.74;
        return power;
    }

    protected void wayAndExpense(LightTransport str) {
        int time = scannerIntLight();
        int way = time * str.maximumSpeed;
        int fuel = way / str.fuelConsumption;
        System.out.println("За время " + time + " часа, автомобиль " + brand + ", двигаясь с максимальной скоростью "
                + str.maximumSpeed + " км/ч проедет " + way + " киллометров и израсходует " + fuel + " литров топлива.");
    }

    static int scannerIntLight() {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Введите время езды на машине: \r");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Введите правильно время езды: \r");
        }
        number = in.nextInt();
        return number;
    }
}