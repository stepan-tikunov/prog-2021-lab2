package edu.ifmo.tikunov.lab2.creature;

import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public interface Creature {
	void getItem(Item item);
	void giveItem(Item item, Creature newOwner);
	void throwItem(Item item);
	void move(Location newLocation);
	Location getLocation();
	boolean participatesInSearch(Item lostItem);
}
