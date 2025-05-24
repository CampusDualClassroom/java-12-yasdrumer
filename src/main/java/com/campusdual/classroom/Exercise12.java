package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasolina");
        myCar.start();
        myCar.accelerate();
        myCar.turnAngleOfWheels(30);
        myCar.showDetails();
        myCar.brake();
        myCar.setReverse(false);
        myCar.isReverse();
        myCar.stop();
    }

}