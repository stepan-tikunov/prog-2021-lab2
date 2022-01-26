package edu.ifmo.tikunov.lab2.item;

import edu.ifmo.tikunov.lab2.creature.*;
import edu.ifmo.tikunov.lab2.location.*;

public interface Item {
	void setLocation(Location newLocation);
	Location getLocation();
	void setOwner(Creature newOwner);
	Creature getOwner();
}
