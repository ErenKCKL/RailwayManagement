package RailwayManagemt.entities.concretes;

public class PassangerRailroadCar extends RailroadCar{
    public PassangerRailroadCar() {
    }

    public PassangerRailroadCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
