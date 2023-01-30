package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;

public class FirstSalon {

    public Type getType() {
        return Type.STANDARD;
    }


    public Procedures getProcedure() {
        return Procedures.COSMETICS;
    }


    public String getAddress() {
        return "Some address";
    }


    public String getReview() {
        return "Standard Riga salon";
    }
}
