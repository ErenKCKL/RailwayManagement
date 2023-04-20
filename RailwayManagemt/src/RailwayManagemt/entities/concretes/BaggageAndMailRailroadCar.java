package RailwayManagemt.entities.concretes;



public class BaggageAndMailRailroadCar extends RailroadCar{
    public BaggageAndMailRailroadCar() {
    }

    public BaggageAndMailRailroadCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
