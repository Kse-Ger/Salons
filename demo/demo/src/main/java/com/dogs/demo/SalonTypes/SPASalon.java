package com.dogs.demo.SalonTypes;

import com.dogs.demo.SalonTypes.Enums.Type;

public interface SPASalon extends Salon {
    @Override
    default Type getType() {
        return Type.SPA;
    }
}
