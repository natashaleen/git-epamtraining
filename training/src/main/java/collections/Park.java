package collections;

import collections.cars.PassengerCar;
import collections.cars.Car;

import java.util.*;

public class Park {
    private List<? extends Car> cars;

    public List<collections.cars.PassengerCar> getPassengerCar() {
        List<? extends Car> l = this.cars;
        List<PassengerCar> x = new ArrayList<>();
        for (Car p : l) {if (p instanceof PassengerCar) {x.add((PassengerCar) p);}}
        return x;
    }

    public Park sortByFuelConsumption() {
        Collections.sort(cars, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return (int) (o1.getFuelConsumption() - o2.getFuelConsumption());
            }
        });
        return this;
    }

    public int getTotalCostOfTheTaxiPark(){
        int totalCost = 0;
        for(PassengerCar car: this.getPassengerCar()) {
            totalCost += car.getCarCost();
        }
        return totalCost;
    }

    public List<PassengerCar> getCarWithPresetMaxSpeedRange(){
        List<PassengerCar> carWithMaxSpeedMoreThan240 = new ArrayList<>();
        List<PassengerCar> passengerCars = getPassengerCar();
        for (int i = 0; i < passengerCars.size(); i++){
            if (passengerCars.get(i).getMaxSpeed() > 240 ){
                carWithMaxSpeedMoreThan240.add(passengerCars.get(i));
            }
        }
        return carWithMaxSpeedMoreThan240;
    }

    @Override
    public String toString() {
        return "{" + "Cars=" + cars.toString() + '}';
    }

    public Park(List<? extends Car> planes) {
        this.cars = planes;
    }

}
