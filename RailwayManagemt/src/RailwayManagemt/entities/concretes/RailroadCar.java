package RailwayManagemt.entities.concretes;


import java.util.List;

public class RailroadCar {

    private static int nextId = 0;
    private int id;
    private String shipper;
    private String securityInformation;
    private double netWeight;
    private double grossWeight;
    private String type;
    private double minCargoWeight;
    private double maxCargoWeight;
    private String deneme;
    private String denemeiki;
    private String denemeüç;
g
    public RailroadCar() {
    }

    public RailroadCar(String shipper,
                       String securityInformation, double netWeight,
                       double grossWeight, String type, double minCargoWeight, double maxCargoWeight) {
        this.id = nextId++;
        this.shipper = shipper;
        this.securityInformation = securityInformation;
        this.netWeight = 0;
        this.grossWeight = 0;
        this.type = type;
        this.minCargoWeight = 0;
        this.maxCargoWeight = maxCargoWeight;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public String getSecurityInformation() {
        return securityInformation;
    }

    public void setSecurityInformation(String securityInformation) {
        this.securityInformation = securityInformation;
    }

    public double getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(double netWeight) {
        this.netWeight = netWeight;
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMinCargoWeight() {
        return minCargoWeight;
    }

    public void setMinCargoWeight(double minCargoWeight) {
        this.minCargoWeight = minCargoWeight;
    }

    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    public void setMaxCargoWeight(double maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{" +
                "id: " + getId() +
                ", shipper: " + getShipper() +
                ", securuty information: " + getSecurityInformation() +
                ", net weight: " + getNetWeight() +
                ", type: " + getType();
    }
}
