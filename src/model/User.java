package model;

import constant.GenderType;

public class User {
    private String id;
    private String name;
    private int phoneNumber;
    private Address address;
    private GenderType genderType;

    public User(String id,String name,int phoneNumber,Address address){
        this.id=id;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.address=address;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public int getPhoneNumber(){
        return  phoneNumber;
    }
    public void setPhoneNumber(){
        this.phoneNumber=phoneNumber;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address=address;

    }

    public GenderType getGenderType() {
        return genderType;
    }
    public void setGenderType(GenderType genderType){
        this.genderType=genderType;

    }

}
