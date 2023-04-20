package RailwayManagemt.entities.concretes;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {
    private static int nextId = 0;
    private int id;
    private String stationName;
    private List<RailwayStation> connectedRailwayStation;

    public RailwayStation() {
    }

    public RailwayStation(String stationName) {
        this.id = nextId++;
        this.stationName = stationName;
        this.connectedRailwayStation = new ArrayList<>();
    }

    public void connectStation(RailwayStation station){
        if (!connectedRailwayStation.contains(station)){
            connectedRailwayStation.add(station);
        }
    }

    public void disconnectStation(RailwayStation station){
        if (connectedRailwayStation.contains(station)){
            connectedRailwayStation.remove(station);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }


    public List<RailwayStation> getConnectedRailwayStation() {
        return connectedRailwayStation;
    }

    public void setConnectedRailwayStation(List<RailwayStation> connectedRailwayStation) {
        this.connectedRailwayStation = connectedRailwayStation;
    }

    @Override
    public String toString() {
        return "RailwayStation{name='" + stationName + "'}";
    }
}
