package collections.cars;

import collections.models.PassengerCarType;


public class PassengerCar extends Car {

    private PassengerCarType type;

    public PassengerCar(String model, int carCost, int maxSpeed, double fuelConsumption, PassengerCarType type) {
        super(model, carCost, maxSpeed, fuelConsumption);
        this.type = type;
    }

    public PassengerCarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", type=" + type + '}');
    }
}
