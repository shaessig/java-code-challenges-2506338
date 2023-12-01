package com.linkedinlearning.challenges.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

	@Test
	void testStandardItem() {
		Item[] items = new Item[]{new Item("+5 Dexterity Vest", 10, 20)};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(19, app.items[0].quality);
		Assertions.assertEquals(9, app.items[0].sellIn);
	}

	@Test
	void testSellinPassed() {
		Item[] items = new Item[]{new Item("+5 Dexterity Vest", 0, 20)};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(18, app.items[0].quality);
		Assertions.assertEquals(-1, app.items[0].sellIn);
	}

	@Test
	void testQualityNotLowerThan0() {
		Item[] items = new Item[]{
				new Item("+5 Dexterity Vest", 10, 0),
				new Item("+7 Dexterity Vest", 0, 0),
				new Item("+6 Dexterity Vest", -1, 1)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(0, app.items[0].quality);
		Assertions.assertEquals(0, app.items[1].quality);
		Assertions.assertEquals(0, app.items[2].quality);
	}

	@Test
	void testQualityINcreasesForBrie() {
		Item[] items = new Item[]{
				new Item("Aged Brie", 10, 20)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(21, app.items[0].quality);
	}

	@Test
	void testQualityNotHigherThan50() {
		Item[] items = new Item[]{
				new Item("Aged Brie", 10, 49),
				new Item("Aged Brie", 10, 50),
				new Item("Aged Brie", 10, 51),
				new Item("Aged Brie", -1, 48),
				new Item("Aged Brie", -1, 49)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(50, app.items[0].quality);
		Assertions.assertEquals(50, app.items[1].quality);
		Assertions.assertEquals(51, app.items[2].quality);
		Assertions.assertEquals(50, app.items[3].quality);
		Assertions.assertEquals(50, app.items[4].quality);
	}

	@Test
	void testQualitySulfurasNotChanging() {
		Item[] items = new Item[]{
				new Item("Sulfuras, Hand of Ragnaros", 0, 80),
				new Item("Sulfuras, Hand of Ragnaros", -1, 80),
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(80, app.items[0].quality);
		Assertions.assertEquals(80, app.items[1].quality);
		Assertions.assertEquals(0, app.items[0].sellIn);
		Assertions.assertEquals(-1, app.items[1].sellIn);
	}

	@Test
	void testQualityBackstagePassesIncrease1() {
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(21, app.items[0].quality);
		Assertions.assertEquals(21, app.items[1].quality);
	}

	@Test
	void testQualityBackstagePassesIncrease2() {
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 6, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 8, 49)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(22, app.items[0].quality);
		Assertions.assertEquals(22, app.items[1].quality);
		Assertions.assertEquals(22, app.items[2].quality);
		Assertions.assertEquals(50, app.items[3].quality);
	}

	@Test
	void testQualityBackstagePassesIncrease3() {
		Item[] items = new Item[]{
				new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 3, 20),
				new Item("Backstage passes to a TAFKAL80ETC concert", 1, 47),
				new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49),
				new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50),
				new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49),
				new Item("Backstage passes to a blahblah concert", -1, 49)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(23, app.items[0].quality);
		Assertions.assertEquals(23, app.items[1].quality);
		Assertions.assertEquals(50, app.items[2].quality);
		Assertions.assertEquals(50, app.items[3].quality);
		Assertions.assertEquals(50, app.items[4].quality);
		Assertions.assertEquals(0, app.items[5].quality);
		Assertions.assertEquals(0, app.items[6].quality);
	}

	@Test
	void testConjuredDegradesTwiceAsFast() {
		Item[] items = new Item[]{
				new Item("Conjured item1", 10, 20),
				new Item("Conjured item2", 10, 20)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(18, app.items[0].quality);
		Assertions.assertEquals(9, app.items[0].sellIn);
		Assertions.assertEquals(18, app.items[1].quality);
	}

	@Test
	void testConjuredDegradesTwiceAsFastExpired() {
		Item[] items = new Item[]{
				new Item("Conjured item1", 0, 20),
				new Item("Conjured item2", 0, 20)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(16, app.items[0].quality);
		Assertions.assertEquals(16, app.items[1].quality);
	}

	@Test
	void testConjuredDegradesTwiceAsFastExpiredNotNegative() {
		Item[] items = new Item[]{
				new Item("Conjured item1", 0, 0),
				new Item("Conjured item1", 10, 1),
				new Item("Conjured item2", 0, 2)
		};
		GildedRose app = new GildedRose(items);
		app.updateInventory();
		Assertions.assertEquals(0, app.items[0].quality);
		Assertions.assertEquals(0, app.items[1].quality);
		Assertions.assertEquals(0, app.items[2].quality);
	}
}
