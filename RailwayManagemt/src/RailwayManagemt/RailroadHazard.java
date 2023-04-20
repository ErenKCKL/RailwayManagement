package RailwayManagemt;

import RailwayManagemt.entities.concretes.TrainSet;

public class RailroadHazard extends Exception{
    private TrainSet trainSet;

    public RailroadHazard(TrainSet trainSet){
        super("Train set " + trainSet.getId() + "has exceeded 200 km/h");
        this.trainSet = trainSet;
    }

    public TrainSet getTrainSet(){
        return trainSet;
    }
}
