package com.linkedinlearning.challenges.gildedrose;

public class InventoryItem {

	private final Item item;

	public InventoryItem(Item item) {
		this.item = item;
	}

	public static InventoryItem create(Item item) {
		if (AgedBrie.NAME.equals(item.name)) {
			return new AgedBrie(item);
		} else if (item.name.contains(BackstagePass.NAME)) {
			return new BackstagePass(item);
		} else if (item.name.contains(Conjured.NAME)) {
			return new Conjured(item);
		} else if (Sulfuras.NAME.equals(item.name)) {
			return new Sulfuras(item);
		}
		return new InventoryItem(item);
	}

	protected void dailyUpdate() {
		updateQuality();
		updateExpiration();
		if (isExpired()) {
			processExpired();
		}
	}

	protected void updateQuality() {
		decreaseQuality();
	}

	protected void updateExpiration() {
		item.sellIn--;
	}

	protected void processExpired() {
		decreaseQuality();
	}

	protected boolean isExpired() {
		return item.sellIn < 0;
	}

	protected void increaseQuality() {
		if (item.quality < 50) {
			item.quality++;
		}
	}

	protected void decreaseQuality() {
		if (item.quality > 0) {
			item.quality--;
		}
	}

	protected Item getItem() {
		return item;
	}
}

