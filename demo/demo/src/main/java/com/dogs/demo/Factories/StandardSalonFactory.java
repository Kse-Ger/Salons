package com.dogs.demo.Factories;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Salon;
import com.dogs.demo.Salons.FirstSalon;
import com.dogs.demo.Salons.NightSPASalon;
import com.dogs.demo.Salons.StandardRigaSalon;

public class StandardSalonFactory implements AbstractSalonFactory{
    @Override
    public Salon makeSalon(Procedures procedure) {
        switch (procedure) {
            case HAIR :
                return new StandardRigaSalon();
            case MASSAGE:
                return new NightSPASalon();
            default:
                throw new RuntimeException(String.format("Unknown Procedure", procedure.toString()));
        }
    }
}
