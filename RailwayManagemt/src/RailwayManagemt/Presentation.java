package RailwayManagemt;


import RailwayManagemt.entities.concretes.Locomotive;
import RailwayManagemt.entities.concretes.PassangerRailroadCar;
import RailwayManagemt.entities.concretes.RailwayStation;
import RailwayManagemt.entities.concretes.TrainSet;

public class Presentation {

    public static void main(String[] args) {

        RailwayStation stationA = new RailwayStation("A");
        RailwayStation stationB = new RailwayStation("B");

        Locomotive locomotive1 = new Locomotive( 5, 2, 1000, 100);
        Locomotive locomotive2 = new Locomotive( 5, 2, 1000, 100);

        PassangerRailroadCar  passengerCar1 = new PassangerRailroadCar("ABC", "ABC", 1000, 1000, "RailroaadCar", 1000, 100);
        PassangerRailroadCar  passengerCar2 = new PassangerRailroadCar("ABC", "ABC", 1000, 1000, "RailroaadCar", 1000, 100);

        TrainSet trainSet1 = new TrainSet(locomotive1);
        TrainSet trainSet2 = new TrainSet(locomotive2);

        trainSet1.attachRailroadCar(passengerCar1);
        trainSet1.attachRailroadCar(passengerCar2);

        Route route1 = new Route(stationA, stationB);

        route1.addTrainSets(trainSet1);
        route1.addTrainSets(trainSet2);

        SaveToFileTrainSets saveFile = SaveToFileTrainSets.getInstance();
        saveFile.addTrainSet(trainSet1);
        saveFile.addTrainSet(trainSet2);
        saveFile.autoSave();


    }

}
