package edu.ifmo.tikunov.lab2.item;

import edu.ifmo.tikunov.lab2.creature.*;
import edu.ifmo.tikunov.lab2.location.*;

public class Hat implements Item {
	private String description;
	private Location location;
	private Creature owner;

	@Override
	public void setLocation(Location newLocation) {
		location = newLocation;
		owner = null;
	}

	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public void setOwner(Creature newOwner) {
		location = newOwner.getLocation();
		owner = newOwner;
	}

	@Override
	public Creature getOwner() {
		return owner;
	}

	public final String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return getDescription();
	}

	@Override
	public int hashCode() {
		return description.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o instanceof Hat) {
			Hat hat = (Hat)o;
			return description.equals(hat.description) &&
				location.equals(hat.location) &&
				owner.equals(hat.owner);
		}
		return false;
	}

	public Hat() {
		this("the hat", null, null);
	}

	public Hat(String description, Location location, Creature owner) {
		this.description = description;
		location.put(this);
		owner.getItem(this);
	}
}
