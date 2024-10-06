
abstract class Engine 
{
    protected String engineType;

    public Engine(String engineType) 
    {
        this.engineType = engineType;
    }

    public String getEngineType() 
    {
        return engineType;
    }
}

class CombustionEngine extends Engine 
{
    public CombustionEngine() 
    {
        super("Combustion Engine");
    }

}

class ElectricEngine extends Engine 
{
    public ElectricEngine() 
    {
        super("Electric Engine");
    }
}

class HybridEngine extends Engine 
{
    public HybridEngine() 
    {
        super("Hybrid Engine");
    }
}

