public class Truck extends Vehicles {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
