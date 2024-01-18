package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.extraCheesePrice = 80;
        if(isVeg){
            this.extraTopingPrice = 70;
        }else{
            this.extraTopingPrice = 120;
        }


        // your code goes here
    }
}
