package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.SPASalon;

public class NightSPASalon implements SPASalon {

    public String getWorkTime() {
        return "From 22:00 To 9:00";
    }
    @Override
    public Procedures getProcedure() {
        return Procedures.MASSAGE;
    }

    @Override
    public String getAddress() {
        return "Salon Address";
    }

    @Override
    public String getReview() {
        return "Best massage at night";
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; Review: "+getReview() + "; Working Time: " + getWorkTime();
    }
}
