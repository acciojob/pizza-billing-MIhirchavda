package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean ischeese ;
    private boolean istakeway ;
    private boolean istopping ;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price += 300;
        }
        else{
            this.price += 400;
        }

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeese) {
            this.price += 80;
            ischeese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istopping) {
            istopping = true;
            if (isVeg) {
                this.price += 70;

            } else {
                this.price += 120;

            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!istakeway) {
            this.price += 20;

            istakeway = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill ="";
        if(isVeg){
            this.bill += "Base Price Of The Pizza: 300\n";
        }
        else {
            this.bill += "Base Price Of The Pizza: 400\n";
        }
        if(ischeese){
            this.bill += "Extra Cheese Added: 80\n";
        }
        if(istopping){
            if(isVeg){
                this.bill += "Extra Toppings Added: 70\n";
            }
            else{
                this.bill += "Extra Toppings Added: 120\n";
            }
        }
        if(istakeway) {
            this.bill += "Paperbag Added: 20\n";
        }
        this.bill +="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
