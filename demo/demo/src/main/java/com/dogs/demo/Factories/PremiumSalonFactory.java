package com.dogs.demo.Factories;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Salon;
import com.dogs.demo.Salons.PremiumNailSalon;
import com.dogs.demo.Salons.PremiumRigaHairSalon;
import com.dogs.demo.Salons.PremiumRigaSalon;
import com.dogs.demo.Salons.StandardRigaSalon;

public class PremiumSalonFactory implements AbstractSalonFactory{
    @Override
    public Salon makeSalon(Procedures procedure) {
        switch (procedure) {
            case ALL :
                return new PremiumRigaSalon();
            case NAILS:
                return new PremiumNailSalon();
            case HAIR:
                return new PremiumRigaHairSalon();
            default:
                throw new RuntimeException(String.format("Unknown Procedure", procedure.toString()));
        }
    }
}
