package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.PREMIUMSalon;

public class PremiumNailSalon implements PREMIUMSalon {
    @Override
    public Procedures getProcedure() {
        return Procedures.NAILS;
    }

    @Override
    public String getAddress() {
        return "Second address";
    }

    @Override
    public String getReview() {
        return "Best nail slaon";
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; Review: "+getReview();
    }
}
