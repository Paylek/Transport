package vechicles;

import java.util.Scanner;

public class FreightTransport extends LandTransport{
    private final int carryingCapacity;


    public FreightTransport(int power, int maximumSpeed, int weight, String brand,
                            int numberOfWheels, int fuelConsumption, int carryingCapacity) {
        super(power, maximumSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public void printInfo (FreightTransport str) {
        System.out.println("Мощность " + str.power +  " лошадиных сил, Максимальная скорость " + str.maximumSpeed +
                "км/ч, Масса " + str.weight + " кг, Бренд " +  str.brand + " Количество колес " + str.numberOfWheels +
                " Расход топлива " + str.fuelConsumption +
                " (литр/100км), Грузоподъемность " + str.carryingCapacity + " тонн, Мощность в килловатах " + powerInKilowatts(power));
    }

    @Override
    public int powerInKilowatts(int power) {
        power *= 0.74;
        return power;
    }

    public void loadingCargo(FreightTransport str) {
        int mass = scannerIntFreight();
        if (mass > (str.carryingCapacity * 1000) - str.weight)
            System.out.println("Вам нужен грузовик побольше");
        else
            System.out.println("Груз загружен");
    }


    static int scannerIntFreight() {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Введите массу груза для загрузки: \r");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Введите правильно массу груза для загрузки: \r");
        }
        number = in.nextInt();
        return number;
    }
}
