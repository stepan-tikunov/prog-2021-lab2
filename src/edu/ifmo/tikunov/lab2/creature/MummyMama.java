package edu.ifmo.tikunov.lab2.creature;

import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public class MummyMama extends Useless {
	@Override
	protected String whyUseless() {
		return "she already tried to find it";
	}

	public MummyMama() {
		this("Mummy Mama", null);
	}

	public MummyMama(String name, Location location) {
		super(name, location);
	}
}
