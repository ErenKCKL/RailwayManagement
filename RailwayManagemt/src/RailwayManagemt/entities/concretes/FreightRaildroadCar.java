package RailwayManagemt.entities.concretes;



public abstract class FreightRaildroadCar extends RailroadCar{
    public FreightRaildroadCar() {
    }

    public FreightRaildroadCar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
