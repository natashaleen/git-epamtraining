import models.PassengerCarType;
import cars.PassengerCar;
import cars.Car;

import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Car> cars = Arrays.asList(
            new PassengerCar("Hyundai Solaris",7900, 193, 6.6, PassengerCarType.ECONOMY),
            new PassengerCar("Kia Rio",9500,192,  9.8, PassengerCarType.ECONOMY),
            new PassengerCar("Skoda Octavia",5100,250,  9.7, PassengerCarType.ECONOMY),
            new PassengerCar("VW Polo",10500,237,  10.0, PassengerCarType.COMFORT),
            new PassengerCar("Ford Focus",7700,263,  10.7, PassengerCarType.COMFORT),
            new PassengerCar("Bentley Mulsanne",68000,305,  16.9, PassengerCarType.BUSINESS),
            new PassengerCar("BMW 7-er",27500,250,  17.1, PassengerCarType.BUSINESS),
            new PassengerCar("Audi A6",36000,250,  18.1, PassengerCarType.BUSINESS)
    );

    public static void main(String[] args) {
        Park park = new Park(cars);
        Park taxiPark = new Park(park.getPassengerCar());
        System.out.println("My new Taxi Park " + taxiPark.toString());
        System.out.println("Taxi park sorted by max fuel consumption: " + taxiPark.sortByFuelConsumption());
        System.out.println("Total cost of the Taxi Park: " + taxiPark.getTotalCostOfTheTaxiPark() + " $");
        System.out.println("Car with max speed more than 240 km/h: " + taxiPark.getCarWithPresetMaxSpeedRange());
    }
}

