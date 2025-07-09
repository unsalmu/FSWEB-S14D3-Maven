package org.example.arge;

public class CarFactory  {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla", "tesla desc", 700, 2000);
        CarSkeleton hybridCar = new HybridCar("toyota", "tyt desc", 40, 600, 4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("honda", "honda dsc", 30, 3);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);
    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine() );
    }

}
