package com.company;

public class Car {
protected int wheelCount;
private String model;
public Car(String model) {
        this.model = model;
        this.wheelCount = 4;
        }
public String getlnfo() {
        return "Model: " + model + " wheels:" + wheelCount;
        }
        }