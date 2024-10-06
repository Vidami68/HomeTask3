
public class Main {
    public static void main(String[] args) {
        Manufacture toyota = new Manufacture("TOYOTA", "Toyota", "Japan");
        Manufacture tesla = new Manufacture("TESLA", "Tesla", "United States");
        Manufacture honda = new Manufacture("HONDA", "Honda", "Japan");

        Engine engine1 = new CombustionEngine();
        Engine engine2 = new ElectricEngine();
        Engine engine3 = new HybridEngine();

        Vehicle[] vehicles = new Vehicle[]{
                new ICEV(engine1, toyota),
                new BEV(engine2, tesla),
                new HybridV(engine3, honda)
        };
        

        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
        }
    }
}
