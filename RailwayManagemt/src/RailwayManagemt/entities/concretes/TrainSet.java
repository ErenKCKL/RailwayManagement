package RailwayManagemt.entities.concretes;


import java.util.ArrayList;
import java.util.List;

public class TrainSet {
    private static int nextId = 0;
    private int id;
    private Locomotive locomotive;
    private List<RailroadCar> railroadCars;

    public TrainSet() {
    }

    public TrainSet( Locomotive locomotive) {
        this.id = nextId++;
        this.locomotive = locomotive;
        this.railroadCars = new ArrayList<>();
    }

    public boolean attachRailroadCar(RailroadCar car){
        return locomotive.addRailroadCar(car);
    }

    public boolean detachRailroadCar(RailroadCar car){
        return railroadCars.remove(car);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trainset ID: ").append(getId()).append("\n");
        stringBuilder.append("Locomotive: ").append(locomotive.toString()).append("\n");
        stringBuilder.append("Railroad cars: ").append("\n");
        for (RailroadCar car : railroadCars){
            stringBuilder.append(car.toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
