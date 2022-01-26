package edu.ifmo.tikunov.lab2;

import edu.ifmo.tikunov.lab2.creature.*;
import edu.ifmo.tikunov.lab2.item.*;
import edu.ifmo.tikunov.lab2.location.*;

public class SearchAnnouncementWithFeast extends SearchAnnouncement {
	@Override
	protected void reward(Creature finder) {
		System.out.println(finder.toString() + " is rewarded with incredible feast!");
	}

	public SearchAnnouncementWithFeast(Creature loser, Item lostItem) {
		super(loser, lostItem);
	}
	
}
