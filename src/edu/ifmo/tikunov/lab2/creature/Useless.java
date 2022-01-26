package edu.ifmo.tikunov.lab2.creature;

import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public abstract class Useless extends Resident {
	abstract protected String whyUseless();

	@Override
	public boolean participatesInSearch(Item item) {
		System.out.println(toString() + " was one of the only residents who stayed home, because " + whyUseless() + ".");
		return false;
	}

	public Useless() {
		this("Granny", null);
	}

	public Useless(String name, Location location) {
		super(name, location);
	}
}
