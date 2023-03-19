public class Car extends Vehicles implements Diagnosticable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем автомобиль марки - " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();

    }
}

