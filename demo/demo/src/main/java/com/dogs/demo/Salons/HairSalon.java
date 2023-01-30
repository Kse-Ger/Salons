package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.Salon;

public abstract class HairSalon{
    public HairSalon(HSalon salon) {
        this.salon = salon;
    }

    public abstract void change();

    public abstract Type getType();
    protected final HSalon salon;
}
