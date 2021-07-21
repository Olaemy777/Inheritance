package com.olaemy;

public class Main {

    public static void main(String[] args) {
	Truck truck=new Truck(3000,"Hulk",'g',200,4,4000);
	truck.outPut();
	truck.newWheels(10);
    }
}
class Car{
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut(){
        System.out.println("Вес "+ model+" составляет "+ weight+"кг.");
        System.out.println("Цвет машины - "+ color+" и её скорость - "+speed);
    }

    public Car(int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    public Car(){}
}
class Truck extends Car{
    int wheels;
    int maxWeight;
    public void newWheels(int wheels){
        this.wheels=wheels;
        System.out.println("Количесво колёс "+ this.wheels);
    }

    public Truck(int weight, String model, char color, float speed, int wheels, int maxWeight) {
        super(weight, model, color, speed);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }
}