package collections.cars;

abstract public class Car {
    String model;
    private int carCost;
    private int maxSpeed;
    private double fuelConsumption;

    public Car (String model, int carCost, int maxSpeed, double fuelConsumption) {
        this.model = model;
        this.carCost = carCost;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() { return model; }
    public int getCarCost() { return carCost; }
    public int getMaxSpeed() { return maxSpeed; }
    public double getFuelConsumption() { return fuelConsumption; }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + ", carCost=" + carCost + "$" +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption + "l" +"}";
    }
}

