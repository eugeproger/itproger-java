package com.itproger.ujsn.constructor;

public class Main {

    public static void main(String[] args) {

        Transport bmw = new Transport(250.5f, 2500, "White", new byte[] {0, 0, 0});
        Transport truck = new Transport(5600, new byte[] {100, 0, 100});
    }
}