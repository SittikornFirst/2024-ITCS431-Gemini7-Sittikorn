public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.serialNumber = "123456";
        vehicle.name = "Sedan";
        vehicle.model = "X123";
        vehicle.year = 2022;
        vehicle.manufacturer = "CarBrand";
        vehicle.baseCost = 25000.00;

        vehicle.displayInfo();
        System.out.println("hi");
    }
}
