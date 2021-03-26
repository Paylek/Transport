package vechicles;

import java.util.Scanner;

public class CivilTransport extends AirTransport{
    private final int numberOfPassengers;
    private final boolean businessClassAvailability;

    public CivilTransport(int power, int maximumSpeed, int weight,
                          String brand, int wingspan, int minRunway, int numberOfPassengers, boolean businessClassAvailability) {
        super(power, maximumSpeed, weight, brand, wingspan, minRunway);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }


    public void printInfo (CivilTransport str) {
        System.out.println("Мощность " + str.power +  " лошадиных сил, Максимальная скорость " + str.maximumSpeed +
                "км/ч, Масса " + str.weight + " кг, Бренд " +  str.brand + " Размах крыльев " + str.businessClassAvailability +
                " метров, Минимальная длина взлетно-посадочной полосы для взлета " + str.minRunway +
                " метров, Количество пассажиров " + str.numberOfPassengers + " Наличие бизнес-класс " + str.businessClassAvailability + " Мощность в килловатах " + powerInKilowatts(power));
    }

    public void loadingPassengers(CivilTransport str) {
        int pass = scannerIntCivil();
        if (pass > str.numberOfPassengers)
            System.out.println("Вам нужен самолет побольше");
        else
            System.out.println("Пассажиры загружены");
    }

    static int scannerIntCivil() {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Введите колличество пассажиров: \r");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Введите правильно колличество пассажиров: \r");
        }
        number = in.nextInt();
        return number;
    }

    @Override
    public int powerInKilowatts(int power) {
        power *= 0.74;
        return power;
    }

}
