package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.Salon;

public class StandardRigaSalon implements Salon {
    @Override
    public Type getType() {
        return Type.STANDARD;
    }

    @Override
    public Procedures getProcedure() {
        return Procedures.HAIR;
    }

    @Override
    public String getAddress() {
        return "Some address";
    }

    @Override
    public String getReview() {
        return "Standard Riga salon";
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; Review: "+getReview();
    }
}
