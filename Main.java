package vechicles;

public class Main {
    public static void main(String[] args) {
        CivilTransport civilTransport = new CivilTransport(570, 350, 44000, "Boeing-737", 29, 1300, 103, true);
        FreightTransport freightTransport = new FreightTransport(340, 100, 26000, "Камаз-5320", 10, 35, 32);
        LightTransport lightTransport = new LightTransport(250, 220, 14000, "Tayota Camry", 4, 8, "Седан", 5);
        MilitaryTransport militaryTransport = new MilitaryTransport(1000, 3000, 30600, "СУ-57", 14, 350, true, 16);
        civilTransport.printInfo(civilTransport);
        civilTransport.loadingPassengers(civilTransport);
        militaryTransport.printInfo(militaryTransport);
        militaryTransport.bailout(militaryTransport);
        militaryTransport.shot(militaryTransport);
        freightTransport.printInfo(freightTransport);
        freightTransport.loadingCargo(freightTransport);
        lightTransport.printInfo(lightTransport);
        lightTransport.wayAndExpense(lightTransport);

    }
}
