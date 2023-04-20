package RailwayManagemt.entities.concretes;



public class ToxicLiquid extends HeavyRailroadFreightCar{
    public ToxicLiquid() {
    }

    public ToxicLiquid(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
