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
        int fullbill = 0;
        if(isVeg){
            System.out.println("Base Price Of The Pizza: 300");
            fullbill += 300;
        }
        else {
            System.out.println("Base Price Of The Pizza: 400");
            fullbill += 400;
        }
        if(ischeese){
            System.out.println("Extra Cheese Added: 80");
            fullbill += 80;
        }
        if(istopping){
            if(isVeg){
                System.out.println("Extra Toppings Added: 70");
                fullbill += 70;
            }
            else{
                System.out.println("Extra Toppings Added: 120");
                fullbill += 120;
            }
        }
        if(istakeway) {
            System.out.println("Paperbag Added: 20");
            fullbill += 20;
        }
        this.bill = "Total Price: "+fullbill;
        return this.bill;
    }
}
