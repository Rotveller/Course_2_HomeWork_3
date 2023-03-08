public class Car extends Vehicles{
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {System.out.println("Меняем покрышку на легковом автомобиле");}
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель легковом автомобиле");
    }
}