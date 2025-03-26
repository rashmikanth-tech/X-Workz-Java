package Inner;

public class Satellite {
    private SatelliteType Type;
    private double Cost;
    private double Weight;
    private double LoadCapacity;

    public SatelliteType getType(){
        return Type;
    }
    public void setType(SatelliteType Type){
        this.Type=Type;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        LoadCapacity = loadCapacity;
    }
}
