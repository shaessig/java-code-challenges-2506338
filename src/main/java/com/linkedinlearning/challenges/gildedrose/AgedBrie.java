package com.linkedinlearning.challenges.gildedrose;

public class AgedBrie extends InventoryItem {
	public static final String NAME = "Aged Brie";

	public AgedBrie(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		increaseQuality();
	}

	@Override
	protected void processExpired() {
		increaseQuality();
	}
}
