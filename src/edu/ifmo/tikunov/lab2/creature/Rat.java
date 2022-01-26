package edu.ifmo.tikunov.lab2.creature;

import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public class Rat extends Resident {
	@Override
	public boolean participatesInSearch(Item lostItem) {
		System.out.println("Even " + toString() + " finds it profitable to participate in search!");
		return true;
	}

	@Override
	public String toString() {
		return "the rat " + getName();
	}

	public Rat() {
		this("from the woods", null);
	}

	public Rat(String name, Location location) {
		super(name, location);
	}
}
