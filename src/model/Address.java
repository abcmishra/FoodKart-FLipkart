package model;

public class Address {
    private String laneNumber;
    private String cityName;
    private int zipCode;
    public Address(String laneNumber,String cityName,int zipCode){
        this.laneNumber=laneNumber;
        this.cityName=cityName;
        this.zipCode=zipCode;
    }
    public String getLaneNumber(){
        return laneNumber;
    }
    public void setLaneNumber(String laneNumber){
        this.laneNumber=laneNumber;
    }

    public String getCityName(){
        return cityName;

    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getZipCode(){
        return zipCode;
    }
    public void setZipCode(int zipCode){
        this.zipCode=zipCode;
    }



}
