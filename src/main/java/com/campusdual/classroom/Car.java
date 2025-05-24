package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.gear = "N"; // Neutral gear by default
        System.out.println("Vehículo creado: " + brand + " " + model + " con combustible " + fuel);
    }

    public Car() {}

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }
    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehiculo acendido");
        } else {
            System.out.println("O vehiculo xa esta acendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehiculo, primero ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.speedometer < MAX_SPEED) {
            this.speedometer += 10;
            this.tachometer += 1000;
            System.out.println("Acelerando. Velocidade actual: " + this.speedometer + " km/h");
        } else {
            System.out.println("Velocidade maxima alcanzada: " + MAX_SPEED + " km/h");
        }
    }

    public void brake() {
        if (this.speedometer > 0) {
            this.speedometer -= 10;
            this.tachometer -= 1000;
            System.out.println("Frenando. Velocidade actual: " + this.speedometer + " km/h");
        } else {
            System.out.println("O vehiculo xa esta parado");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle > 45) {
            this.wheelsAngle = 45;
            System.out.println("Angulo maximo alcanzado: 45 grados");
        } else if (angle < -45) {
            this.wheelsAngle = -45;
            System.out.println("Angulo minimo alcanzado: -45 grados");
        } else {
            this.wheelsAngle = angle;
            System.out.println("Volante girado a " + angle + " grados");
        }
    }

    public String showSteeringWheelDetail() {
        if (this.wheelsAngle != 0) {
            return "Volante xirado a " + this.wheelsAngle + " graos";
        }
        return "Volante en posicion neutra";
    }

    public boolean isReverse() {
        if (this.reverse) {
            System.out.println("O vehiculo está en marcha atras");
            return true;
        }
        return false;
    }

    public void setReverse(boolean reverse) {
        if (reverse) {
            if (this.speedometer == 0) {
                this.gear = "R";
                System.out.println("O vehiculo esta agora en marcha atras");
            } else {
                // No cambiar la marcha si el coche está en movimiento
                System.out.println("Non se pode poñer marcha atras en movemento");
            }
        } else {
            this.gear = "N";
            System.out.println("O vehiculo xa non está en marcha atras");
        }
    }

    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocimetro: " + this.speedometer + " km/h");
        System.out.println("Tacómetro: " + this.tachometer + " rpm");
        System.out.println("Engranaje: " + this.gear);
        System.out.println("Marcha atras: " + (this.reverse ? "Activada" : "Desactivada"));
        System.out.println(showSteeringWheelDetail());
    }
}
