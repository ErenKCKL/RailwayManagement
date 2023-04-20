package RailwayManagemt.entities.concretes;



public class PostOfficRailroadCar extends RailroadCar{
    public PostOfficRailroadCar() {
    }

    public PostOfficRailroadCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
