package RailwayManagemt.entities.concretes;

import RailwayManagemt.entities.abstracts.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Locomotive implements Entity {
    private static int nextId = 0;
    private int id;
    private String homeRailwayStation;
    private String destinationRailwayStation;
    private int maxRailroadCars;
    private int maxElectricityRailroadCars;
    private double maxLoadWeight;
    private double speed;
    private List<RailroadCar> railroadCars;

    public Locomotive() {
    }

    public boolean addRailroadCar(RailroadCar railroadCar){
        if (railroadCars.size() < maxRailroadCars && checkWeigthLimit(railroadCar)) {
            railroadCars.add(railroadCar);
            return true;
        }else {
            return false;
        }
    }

    private boolean checkWeigthLimit(RailroadCar railroadCar){
        double totalWeight = railroadCar.getGrossWeight();
        for(RailroadCar existingCar : railroadCars){
            totalWeight += existingCar.getGrossWeight();
        }
        return totalWeight <= 0;
    }

    public void changeSpeed()
    {
        int randomNumber = new Random().nextInt(100) +1;
        double newSpeed = speed * 0.04;

        if(randomNumber <= 100)
            speed += newSpeed;
        else
        {
            if(speed < newSpeed)
                speed = 0;
            else
                speed -= newSpeed;
        }
    }

    public Locomotive(int maxRailroadCars, int maxElectricityRailroadCars, double maxLoadWeight, double speed) {
        this.id = nextId++;
        //this.homeRailwayStation = homeRailwayStation;
        //this.destinationRailwayStation = destinationRailwayStation;
        this.maxElectricityRailroadCars = maxElectricityRailroadCars;
        this.maxRailroadCars = maxRailroadCars;
        this.maxLoadWeight = maxLoadWeight;
        this.speed = 0;
        this.railroadCars = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeRailwayStation() {
        return homeRailwayStation;
    }

    public void setHomeRailwayStation(String homeRailwayStation) {
        this.homeRailwayStation = homeRailwayStation;
    }


    public String getDestinationRailwayStation() {
        return destinationRailwayStation;
    }

    public void setDestinationRailwayStation(String destinationRailwayStation) {
        this.destinationRailwayStation = destinationRailwayStation;
    }

    public int getMaxRailroadCars() {
        return maxRailroadCars;
    }

    public void setMaxRailroadCars(int maxRailroadCars) {
        this.maxRailroadCars = maxRailroadCars;
    }

    public int getMaxElectricityRailroadCars() {
        return maxElectricityRailroadCars;
    }

    public void setMaxElectricityRailroadCars(int maxElectricityRailroadCars) {
        this.maxElectricityRailroadCars = maxElectricityRailroadCars;
    }

    public double getMaxLoadWeight() {
        return maxLoadWeight;
    }

    public void setMaxLoadWeight(double maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public List<RailroadCar> getRailroadCars() {
        return railroadCars;
    }

    public void setRailroadCars(List<RailroadCar> railroadCars) {
        this.railroadCars = railroadCars;
    }

    @Override
    public String toString(){
        return "Locomotive{" +
                "id: " + getId() +
                ", homeRailwayStation: " + getHomeRailwayStation() +
                ", destinationRailwayStation: " + getDestinationRailwayStation() +
                ", maxRailroadCars: " + getMaxRailroadCars() +
                ", maxElectricityRailroadCars: " + getMaxElectricityRailroadCars() +
                ", maxLoadWeight: " + getMaxLoadWeight() +
                ", speed: " + getSpeed();
    }
}
