package model;

import constant.CuisineType;

import java.util.List;

public class Restaurant {
    private String restaurantName;
    private List<Integer> listOfServiceZipcode;
    private List<CuisineType> cuisineTypes;
    private List<Integer> foodItemPrice;
    private int initialQuantity;

    public Restaurant(String restaurantName,List<Integer> listOfServiceZipcode,List<CuisineType> cuisineTypes,
                      List<Integer> foodItemPrice,int initialQuantity
                      ){
        this.restaurantName=restaurantName;
        this.listOfServiceZipcode=listOfServiceZipcode;
        this.cuisineTypes=cuisineTypes;
        this.foodItemPrice=foodItemPrice;
        this.initialQuantity=initialQuantity;

    }
    public String getRestaurantName(){
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName){
        this.restaurantName=restaurantName;

    }
    public List<Integer> getListOfServiceZipcode(){
        return listOfServiceZipcode;
    }
    public void setListOfServiceZipcode(List<Integer> listOfServiceZipcode){
        this.listOfServiceZipcode=listOfServiceZipcode;
    }
    public List<CuisineType> getCuisineTypes(){
        return cuisineTypes;
    }
    public void setCuisineTypes(List<CuisineType> cuisineTypes){
        this.cuisineTypes=cuisineTypes;

    }
    public List<Integer> getFoodItemPrice(){
        return foodItemPrice;
    }
    public void setFoodItemPrice(List<Integer> foodItemPrice){
        this.foodItemPrice=foodItemPrice;
    }
    public int getInitialQuantity(){
        return initialQuantity;
    }
    public void setInitialQuantity(int initialQuantity){
        this.initialQuantity=initialQuantity;

    }




















}
