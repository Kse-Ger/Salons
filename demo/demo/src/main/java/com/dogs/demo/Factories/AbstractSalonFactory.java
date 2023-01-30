package com.dogs.demo.Factories;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.PREMIUMSalon;
import com.dogs.demo.SalonTypes.Salon;

public interface AbstractSalonFactory {

    Salon makeSalon(Procedures procedure);

    static AbstractSalonFactory makeSalonFactory(Type type) {
        switch (type) {
            case STANDARD :
                return new StandardSalonFactory();
            case PREMIUM:
                return new PremiumSalonFactory();
            case SPA:
                return new StandardSalonFactory();
            default:
                throw new RuntimeException(String.format("Unknown type", type.toString()));
        }
    }
}
