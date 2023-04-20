package RailwayManagemt.entities.concretes;



public class RefrigeratedRailroadcar extends FreightRaildroadCar{
    public RefrigeratedRailroadcar() {
    }

    public RefrigeratedRailroadcar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
