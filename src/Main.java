
public class Main {
    public static void main(String[] args) {
        Vehicles bicycle = new Bicycle("Olymp", 2);
        Vehicles car = new Car("BMW", 4);
        Vehicles truck = new Truck("Iveco", 12);
        ServiceStationVehicles.checkBicycle(bicycle);
        ServiceStationVehicles.checkCar(car);
        ServiceStationVehicles.checkTruck(truck);
    }
}