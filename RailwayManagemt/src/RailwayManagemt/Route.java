package RailwayManagemt;

import RailwayManagemt.entities.concretes.RailwayStation;
import RailwayManagemt.entities.concretes.TrainSet;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Route {
    private RailwayStation startStation;
    private RailwayStation endStation;
    private List<RailwayStation> path;
    private List<TrainSet> trainSets;

    public Route(RailwayStation startStation, RailwayStation endStation){
        this.startStation = startStation;
        this.endStation = endStation;
        this.path = new ArrayList<>();
        this.trainSets = new ArrayList<>();

    }

    public boolean addTrainSets(TrainSet trainSet){
        if (trainSets.isEmpty()) {
            trainSets.add(trainSet);
            return true;
        } else {
            return false;
        }
    }

    public void removeTrainSet(TrainSet trainSet){
        trainSets.remove(trainSet);
    }

}
