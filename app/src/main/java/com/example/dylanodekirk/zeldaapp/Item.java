package com.example.dylanodekirk.zeldaapp;

/**
 * Created by dylanodekirk on 9/9/17.
 */

public class Item {

    public String itemName;
    public int imageSource;
    public String itemdescription = "";

    public Item(String itemName, int imageSource) {
        this.itemName = itemName;
        this.imageSource = imageSource;
    }

    public Item(String itemName, int imageSource, String itemdescription) {
        this.itemName = itemName;
        this.imageSource = imageSource;
        this.itemdescription = itemdescription;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }
}
