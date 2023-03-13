public class ServiceStationVehicles {
    public static void checkTruck(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            int sum = 0;
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                sum = sum + i;
            }
            updateTyre();
            System.out.println(sum + "раз");
            checkEngine();
            checkTrailer();
        }
    }

    static void checkCar(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            int sum = 0 - 2;
            for (int i = 0; i < car.getWheelsCount(); i++) {
                sum = sum + i;
            }
            updateTyre();
            System.out.println(sum + "раз");
            checkEngine();
        }
    }

    public void service(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }
}



