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
            System.out.println("Base Price Of The Pizza: "+ this.price);
        }
        else{
            this.price += 400;
            System.out.println("Base Price Of The Pizza: "+this.price);
        }

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ischeese) {
            this.price += 80;
            System.out.println("Extra Cheese Added: 80");
            ischeese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!istopping) {
            istopping = true;
            if (isVeg) {
                this.price += 70;
                System.out.println("Extra Toppings Added: 70");
            } else {
                this.price += 120;
                System.out.println("Extra Toppings Added: 120");
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!istakeway) {
            this.price += 20;
            System.out.println("Paperbag Added: 20");
            istakeway = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = "";
        String ans = "Total Price: "+this.price;
        this.bill += ans ;
        return this.bill;
    }
}
