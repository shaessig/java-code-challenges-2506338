package com.linkedinlearning.challenges.gildedrose;

public class BackstagePass extends InventoryItem {
	public static final String NAME = "Backstage passes";

	public BackstagePass(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		increaseQuality();
		if (getItem().sellIn < 11) {
			increaseQuality();
		}
		if (getItem().sellIn < 6) {
			increaseQuality();
		}
	}

	@Override
	protected void processExpired() {
		getItem().quality = 0;
	}
}
