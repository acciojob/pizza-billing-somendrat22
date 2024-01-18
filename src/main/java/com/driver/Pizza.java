package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;

    public int extraTopingPrice;

    private int basicExtraToppingPrice;

    public int extraCheesePrice;

    private int basicExtraCheesePrice;

    private int papperBagPrice;

    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.basicExtraCheesePrice = 80;
        this.papperBagPrice = 20;
        if(isVeg){
            this.basePrice = 300;
            this.price = this.basePrice;
            this.basicExtraToppingPrice = 70;
        }else{
            this.basePrice = 400;
            this.price = this.basePrice;
            this.basicExtraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.extraCheesePrice += this.basicExtraCheesePrice;
        // your code goes here
    }

    public void addExtraToppings(){
        this.extraTopingPrice += this.basicExtraToppingPrice;
        // your code goes here
    }

    public void addTakeaway(){
        // your code goes here
        this.takeAway = true;
    }

    public String getBill(){
        // your code goes here
        if(this.extraCheesePrice != 0) {
            this.price += this.extraCheesePrice;
            this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
        }
        if(this.extraTopingPrice != 0) {
            this.price += this.extraTopingPrice;
            this.bill += "Extra Toppings Added: " + this.extraTopingPrice + "\n";
        }
        if(this.takeAway){
            this.price += this.papperBagPrice;
            this.bill += "Paperbag Added: " + this.papperBagPrice + "\n";
        }

        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
