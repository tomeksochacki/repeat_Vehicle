class Vehicle {

        int fuelcap;
        int passengers;
        double lkm;

}

class VehicleDemo{
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        int range;

        miniVan.passengers = 7;
        miniVan.fuelcap = 65;
        miniVan.lkm = 9.1;

        range = (int) (miniVan.fuelcap / miniVan.lkm * 100);
        System.out.println("Minivan transport: " + miniVan.passengers + " passengers at a distance: " + range + " km.");
    }
}

class TwoVehicles{
    public static void main(String[] args) {
        Vehicle minivan1 = new Vehicle();
        Vehicle sportcar2 = new Vehicle();
        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;
        Vehicle car3 = new Vehicle();
        car2 = car3;

        int range1, range2;

        minivan1.passengers = 7;
        minivan1.fuelcap = 65;
        minivan1.lkm = 9.1;

        sportcar2.passengers = 2;
        sportcar2.fuelcap = 55;
        sportcar2.lkm = 12.5;

        range1 = (int) (minivan1.fuelcap/minivan1.lkm *100);
        range2 = (int) (sportcar2.fuelcap/sportcar2.lkm *100);

        System.out.println("Minivan1 transport: " + minivan1.passengers + " passengers, at a distance: " + range1 + " km.");
        System.out.println("Sportcar1 transport: " + sportcar2.passengers + " passengers, at a distance: " + range2 + " km.");

        car1.lkm = 9.5;
        System.out.println(car1.lkm);
        System.out.println(car2.lkm);
    }
}
