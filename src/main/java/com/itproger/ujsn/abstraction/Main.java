package com.itproger.ujsn.abstraction;

public class Main {

    public static void main(String[] args) {
        //Car bmw = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0});
        Truck truck = new Truck(5600, new byte[] {100, 0, 100});
        truck.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0}, true);
        System.out.println(truck.getValues());
    }
}