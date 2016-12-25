package com.ocowagames.league_of_legends_item_price_guesser;

/**
 * Created by Derek on 12/25/2016.
 */

public class Item {

    private int drawableId,price;

    public Item(int drawableId,int price){
        this.drawableId = drawableId;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public int getDrawableId(){
        return drawableId;
    }

}
