package com.dogs.demo.Salons;

public class PremiumRigaHairSalon extends PremiumRigaSalon{
    @Override
    public String getInfo() {
        return "Type: " + getType() + "; Review: "+getReview() + "Best Master: " + getBestHairMaster();
    }

    public String getBestHairMaster() {
        return "Hair stylist Valentina";
    }
}
