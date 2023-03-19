public class Truck extends Vehicles{
    @Override
    public void service() {
        System.out.println("Обслуживаем грузовой автомобиль марки - " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }

        checkEngine();
        checkTrailer();
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    static void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }


    static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
