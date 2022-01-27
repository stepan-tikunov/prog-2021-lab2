package edu.ifmo.tikunov.lab2;

import edu.ifmo.tikunov.lab2.creature.*;
import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public class Main {
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * "ПРОПАЛА СУМКА МУМИ-МАМЫ! Никаких путеводных  нитей! *
     * Розыски   продолжаются.  Неслыханное   пиршество   в *
     * вознаграждение  за  находку!"  Как  только   новость *
     * облетела долину,  по  всему  лесу,  на  горах  и  на *
     * морском   побережье   поднялась   страшная  беготня. *
     * Даже последняя лесная крыса и та сочла небезвыгодным *
     * принять  участие  в  поисках.  Дома  остались   лишь *
     * старые   да   недужные,  и   вся  долина  огласилась *
     * криками и топотом ног.                               *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * */

	public static void main(String... args) {
		Valley valley = new Valley();

		Place woods = new Place(Place.Type.WOODS);
		Place mountains = new Place(Place.Type.MOUNTAINS);
		Place coast = new Place(Place.Type.COAST);

		valley.addPlaces(woods, mountains, coast);

		Resident vanya = new Resident("Vanya from the woods", woods);
		Old granny = new Old("Granny from the woods", woods);
		Rat woodsRat = new Rat("from the woods", woods);
		Resident vova = new Resident("Vova from the mountains", mountains);
		Resident dima = new Resident("Dima from the mountains", mountains);
		Sick grisha = new Sick("Grisha from the mountains", mountains);
		Resident sasha = new Resident("Sasha from the coast", coast);

		MummyMama mummyMama = new MummyMama("Mummy Mama", woods);
		Bag bag = new Bag("bag", valley, mummyMama);
		valley.put(bag);

		System.out.println("When Mummy Mama was in " + bag.getLocation().toString() + ", she lost her bag and now she doesn't know where to find it.");

		SearchAnnouncementWithFeast announcement = new SearchAnnouncementWithFeast(mummyMama, bag);

		announcement.startSearch(valley);
	}
}
