package com.dogs.demo.SalonTypes;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;

public interface Salon {

    Type getType();

    Procedures getProcedure();
    String getAddress();
    String getReview();

    String getInfo();

}
