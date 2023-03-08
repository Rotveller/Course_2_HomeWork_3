public interface ServiceStationVehicles {
     static void checkBicycle(Vehicles bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }

     static void checkCar(Vehicles car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
        }
    }

     static void checkTruck(Vehicles truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        }
    }
    private static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private static void checkTrailer() {
        System.out.println("Проверяем прицеп");}
}

