package RailwayManagemt.entities.concretes;

public class ExplosiveRailroadCar extends HeavyRailroadFreightCar{
    public ExplosiveRailroadCar() {
    }

    public ExplosiveRailroadCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
