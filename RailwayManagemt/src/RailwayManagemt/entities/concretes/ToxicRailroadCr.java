package RailwayManagemt.entities.concretes;



public class ToxicRailroadCr extends HeavyRailroadFreightCar{
    public ToxicRailroadCr() {
    }

    public ToxicRailroadCr(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
