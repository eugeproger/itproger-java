package com.itproger.ujsn.inner;

public class Main {

    public static void main(String[] args) {
//        Car bmw = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0});
//        bmw.engine.setValues(false, 2000);
//        bmw.engine.info();
//
//        Truck truck = new Truck(5600, new byte[] {100, 0, 100});
//        truck.engine.setValues(true, 10);
//        truck.engine.info();

//        truck.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0}, true);
//        System.out.println(truck.getValues());

        Car flyCar = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0}) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("Car is flying");
            }
        };

        flyCar.moveObject(450);
    }
}
