package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.Salon;

public class DowngradeSalon extends HairSalon {

    public DowngradeSalon(HSalon salon) {
        super(salon);
    }
    @Override
    public void change() {
        System.out.println("Salon is downgraded from "+getType()+" to STANDARD");
        salon.setNewType(new UpgradeHairSalon(salon));
    }

    @Override
    public Type getType() {
        return Type.PREMIUM;
    }
}
