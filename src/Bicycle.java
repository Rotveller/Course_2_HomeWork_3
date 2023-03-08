public class Bicycle extends Vehicles implements ServiceStationVehicles  {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    static void updateTyre() {
        System.out.println("Меняем покрышку");}
}
