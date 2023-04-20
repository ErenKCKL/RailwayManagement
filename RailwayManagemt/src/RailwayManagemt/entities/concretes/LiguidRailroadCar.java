package RailwayManagemt.entities.concretes;



public class LiguidRailroadCar extends FreightRaildroadCar{
    public LiguidRailroadCar() {
    }

    public LiguidRailroadCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
