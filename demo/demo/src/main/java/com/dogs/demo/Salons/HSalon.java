package com.dogs.demo.Salons;

import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;

public class HSalon {

    private HairSalon currenthairSalon;

    public HSalon() {
        this.currenthairSalon = new DowngradeSalon(this);
    }

    public void setNewType(final HairSalon hairSalon) {
        currenthairSalon = hairSalon;
    }
    public Type getType() {
        return currenthairSalon.getType();
    };
    public void change() {
        currenthairSalon.change();
    }
}
