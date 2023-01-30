package com.dogs.demo;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.Salon;
import com.dogs.demo.Salons.FirstSalon;

public class SalonAdapter implements Salon {
    FirstSalon firstSalon;

    public SalonAdapter(FirstSalon firstSalon) {
        this.firstSalon = firstSalon;
    }


    @Override
    public Type getType() {
        return firstSalon.getType();
    }

    @Override
    public Procedures getProcedure() {
        return firstSalon.getProcedure();
    }

    @Override
    public String getAddress() {
        return firstSalon.getAddress();
    }

    @Override
    public String getReview() {
        return firstSalon.getReview();
    }

    @Override
    public String getInfo() {
        return "Type: " + getType() + "; Review: "+getReview();
    }
}
