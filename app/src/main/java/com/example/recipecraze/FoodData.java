package com.example.recipecraze;

public class FoodData {

    private String itemName;
    private String itemDescription;
    private String itemMin;
    private String itemImage;
    private String key;
    private String recipeKey;

    public FoodData() {

    }

    public FoodData(String itemName, String itemDescription, String itemMin, String itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemMin = itemMin;
        this.itemImage = itemImage;
    }

    public FoodData(String itemName, String itemDescription, String itemMin, String itemImage, String key,String recipeKey){
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemMin = itemMin;
        this.itemImage = itemImage;
        this.key = key;
        this.recipeKey = recipeKey;
    }

    public FoodData(String pizza, String s, String url, String uniqueKey1, String recipeKey1) {

    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemMin() {
        return itemMin;
    }

    public String getItemImage() {
        return itemImage;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRecipeKey() {
        return recipeKey;
    }

    public void setRecipeKey(String recipeKey) {
        this.recipeKey = recipeKey;
    }

}
