package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.PREMIUMSalon;

public class PremiumRigaSalon implements PREMIUMSalon {

    @Override
    public Procedures getProcedure() {
        return Procedures.ALL;
    }

    @Override
    public String getAddress() {
        return "Best address in the world";
    }

    @Override
    public String getReview() {
        return "Best Salon for exclusive clients in the area.";
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; Review: "+getReview();
    }
}
