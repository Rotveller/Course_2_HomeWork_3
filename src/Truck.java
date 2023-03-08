public class Truck extends Vehicles {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку на грузовом автомобиле");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовом автомобиле");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовом автомобиле");
    }
}
