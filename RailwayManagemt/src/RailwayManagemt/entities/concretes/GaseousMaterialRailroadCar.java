package RailwayManagemt.entities.concretes;


public class GaseousMaterialRailroadCar extends FreightRaildroadCar{
    public GaseousMaterialRailroadCar() {
    }

    public GaseousMaterialRailroadCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
