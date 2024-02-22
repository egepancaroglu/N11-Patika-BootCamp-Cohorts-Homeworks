package entity;

import java.text.DecimalFormat;

/**
 * @author egepancaroglu
 */

public abstract class BaseBuild {

    private double propertyPrice;
    private int totalLivingArea;
    private int numberOfRooms;
    private int numberOfHalls;

    public BaseBuild(double propertyPrice, int totalLivingArea, int numberOfRooms, int numberOfHalls) {
        this.propertyPrice = propertyPrice;
        this.totalLivingArea = totalLivingArea;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }

    public double getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(double propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public int getTotalLivingArea() {
        return totalLivingArea;
    }

    public void setTotalLivingArea(int totalLivingArea) {
        this.totalLivingArea = totalLivingArea;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return "Build Type : " + this.getClass().getSimpleName() +
                "{Price = " + df.format(propertyPrice) + "\u20BA" +
                ", totalArea = " + totalLivingArea + "\u33A1" +
                ", Room Count = " + numberOfRooms +
                ", Hall Count = " + numberOfHalls + "}\n";
    }
}
