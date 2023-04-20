package RailwayManagemt.entities.concretes;



public class RestaurantRailroadcar extends RailroadCar{

    public RestaurantRailroadcar() {
    }

    public RestaurantRailroadcar(String shipper, String securityInformation, double netWeight, double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        super(shipper, securityInformation, netWeight, grossWeight, type, minCargoWeight, maxCargoWeight);
    }
}
