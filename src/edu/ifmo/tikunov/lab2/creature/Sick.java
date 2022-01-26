package edu.ifmo.tikunov.lab2.creature;

import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public class Sick extends Useless {
	@Override
	protected String whyUseless() {
		return "they're sick";
	}

	public Sick() {
		this("Bolnoy", null);
	}

	public Sick(String name, Location location) {
		super(name, location);
	}
}
