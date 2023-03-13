public class Car extends Vehicles {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
   static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
