package src.main.java.tv.codely.kata.gildedrose;


import java.util.List;

public final class GildedRose {

    public void updateQuality(List<UpdatableItem> items) {
        items.forEach(UpdatableItem::update);
    }
}
