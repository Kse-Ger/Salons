package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.Salon;

public class UpgradeHairSalon extends HairSalon {

    public UpgradeHairSalon(HSalon salon) {
        super(salon);
    }
    @Override
    public void change() {
        System.out.println("Salon is upgraded from "+getType()+" to PREMIUM");
        salon.setNewType(new DowngradeSalon(salon));
    }

    @Override
    public Type getType() {
        return Type.STANDARD;
    }
}
