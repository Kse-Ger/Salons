package com.dogs.demo;

import com.dogs.demo.Factories.AbstractSalonFactory;
import com.dogs.demo.SalonTypes.Enums.Procedures;
import com.dogs.demo.SalonTypes.Enums.Type;
import com.dogs.demo.SalonTypes.Salon;
import com.dogs.demo.Salons.FirstSalon;
import com.dogs.demo.Salons.HSalon;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class DogsApplication {

	static final int CHANGE_TIMES = 5;
	public static void main(String[] args) {
		final List<Salon> salonList = new LinkedList<>();

		final AbstractSalonFactory standardSalonFactory = AbstractSalonFactory.makeSalonFactory(Type.STANDARD);
		final AbstractSalonFactory premiumSalonFactory = AbstractSalonFactory.makeSalonFactory(Type.PREMIUM);
		final AbstractSalonFactory spaSalonFactory = AbstractSalonFactory.makeSalonFactory(Type.SPA);

		final Salon standardSalon = standardSalonFactory.makeSalon(Procedures.HAIR);
		final Salon premiumNailSalon = premiumSalonFactory.makeSalon(Procedures.NAILS);
		final Salon premiumSalon = premiumSalonFactory.makeSalon(Procedures.ALL);
		final Salon premiumHairSalon = premiumSalonFactory.makeSalon(Procedures.HAIR);
		final Salon spaSalon = spaSalonFactory.makeSalon(Procedures.MASSAGE);

		salonList.add(standardSalon);
		salonList.add(premiumSalon);
		salonList.add(premiumNailSalon);
		salonList.add(premiumHairSalon);
		salonList.add(spaSalon);



		for (Salon salon: salonList) {
			System.out.println(salon.getInfo());
		}

		final FirstSalon firstSalon = new FirstSalon();
		final SalonAdapter salonAdapter = new SalonAdapter(firstSalon);

		System.out.println(salonAdapter.getReview());

		final HSalon salon = new HSalon();
		System.out.println("Salon created. Initial Type: "+salon.getType());
		System.out.println("Will change type "+ CHANGE_TIMES + " times");
		for(int i=0; i<CHANGE_TIMES; i++) {
			salon.change();
		}
	}

}
