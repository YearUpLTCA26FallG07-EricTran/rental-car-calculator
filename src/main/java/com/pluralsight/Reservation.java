package com.pluralsight;

public class Reservation {

    //pickup date (Store as string)
    private String pickUpDate;
    //number of days
    private int numberOfDays;
    //electric toll tag?? (boolean)
    private boolean acceptsTollTag;
    //GPS ?? Y/N (boolean)
    private boolean acceptsGps;
    // Roadside assistance ?? Y/N (boolean)
    private boolean acceptsRoadSide;
    //Current Age
    private int driverCurrentAge;


    public Reservation() {
    }

    public Reservation(String pickUpDate, int numberOfDays, boolean acceptsTollTag, boolean acceptsGps, boolean acceptsRoadSide, int driverCurrentAge) {
        this.pickUpDate = pickUpDate;
        this.numberOfDays = numberOfDays;
        this.acceptsTollTag = acceptsTollTag;
        this.acceptsGps = acceptsGps;
        this.acceptsRoadSide = acceptsRoadSide;
        this.driverCurrentAge = driverCurrentAge;
    }

    public String getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(String pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public boolean isAcceptsTollTag() {
        return acceptsTollTag;
    }

    public void setAcceptsTollTag(boolean acceptsTollTag) {
        this.acceptsTollTag = acceptsTollTag;
    }

    public boolean isAcceptsGps() {
        return acceptsGps;
    }

    public void setAcceptsGps(boolean acceptsGps) {
        this.acceptsGps = acceptsGps;
    }

    public boolean isAcceptsRoadSide() {
        return acceptsRoadSide;
    }

    public void setAcceptsRoadSide(boolean acceptsRoadSide) {
        this.acceptsRoadSide = acceptsRoadSide;
    }

    public int getDriverCurrentAge() {
        return driverCurrentAge;
    }

    public void setDriverCurrentAge(int driverCurrentAge) {
        this.driverCurrentAge = driverCurrentAge;
    }
}
