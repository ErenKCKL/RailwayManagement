package RailwayManagemt.entities.concretes;



public abstract class HeavyRailroadFreightCar extends RailroadCar{
    public HeavyRailroadFreightCar() {
    }

    public HeavyRailroadFreightCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
