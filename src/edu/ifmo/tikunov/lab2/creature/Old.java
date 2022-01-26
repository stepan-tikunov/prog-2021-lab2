package edu.ifmo.tikunov.lab2.creature;

import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public class Old extends Useless {
	@Override
	protected String whyUseless() {
		return "they're too old";
	}

	public Old() {
		this("Granny", null);
	}

	public Old(String name, Location location) {
		super(name, location);
	}
}
