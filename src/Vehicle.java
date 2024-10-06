
abstract class Vehicle {
    protected Engine engine;
    protected Manufacture manufacture;

    public Vehicle(Engine engine, Manufacture manufacture) {
        this.engine = engine;
        this.manufacture = manufacture;
    }

    abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Engine engine, Manufacture manufacture) {
        super(engine, manufacture);
    }

    void ShowCharacteristics() {
        System.out.println("ICEV with a " + engine.getEngineType() + " from " + manufacture.getName() + ".");
    }
}

class BEV extends Vehicle {
    public BEV(Engine engine, Manufacture manufacture) {
        super(engine, manufacture);
    }

    void ShowCharacteristics() {
        System.out.println("BEV with a " + engine.getEngineType() + " from " + manufacture.getName() + ".");
    }
}

class HybridV extends Vehicle {
    public HybridV(Engine engine, Manufacture manufacture) {
        super(engine, manufacture);
    }

    void ShowCharacteristics() {
        System.out.println("HybridV with a " + engine.getEngineType() + " from " + manufacture.getName() + ".");
    }
}


