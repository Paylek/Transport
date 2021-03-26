package vechicles;

public class MilitaryTransport extends AirTransport{
    private final boolean ejection;
    private final int numberOfMissiles;

    public MilitaryTransport(int power, int maximumSpeed, int weight,
                             String brand, int wingspan, int minRunway, boolean ejection, int numberOfMissiles) {
        super(power, maximumSpeed, weight, brand, wingspan, minRunway);
        this.ejection = ejection;
        this.numberOfMissiles = numberOfMissiles;
    }

    public void printInfo (MilitaryTransport str) {
        System.out.println("Мощность " + str.power +  " лошадиных сил, Максимальная скорость " + str.maximumSpeed +
                "км/ч, Масса " + str.weight + " кг, Бренд " +  str.brand + " Размах крыльев " + str.wingspan +
                ", метров Минимальная длина взлетно-посадочной полосы для взлета " + str.minRunway +
                ", метров Наличие системы катапультирования " + str.ejection + " Количество ракет на борту " + str.numberOfMissiles + " Мощность в килловатах " + powerInKilowatts(power));
    }

    public void shot(MilitaryTransport str) {
        if (str.numberOfMissiles == 0)
            System.out.println("Боеприпасы отсутствуют");
        else
            System.out.println("Ракета пошла");
    }

    @Override
    public int powerInKilowatts(int power) {
        power *= 0.74;
        return power;
    }

    public void bailout(MilitaryTransport str) {
        if (str.ejection == false)
            System.out.println("У Вас нет системы катапультирования");
        else
            System.out.println("Катапультирование прошло успешно");
    }


}
