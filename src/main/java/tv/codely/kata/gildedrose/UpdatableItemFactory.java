package src.main.java.tv.codely.kata.gildedrose;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class UpdatableItemFactory {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    static UpdatableItem basedOn(Item item) {
        switch(item.name) {
            case AGED_BRIE:
                return new AgedBrie(item);
                break;
            case BACKSTAGE_PASSES:
                return new BackstagePasses(item);
                break;
            case SULFURAS:
                return new Sulfuras(item);
                break;
            default:
                return new DefaultItem((item);
                break;
        }
    }

    static List<UpdatableItem> basedOn(List<Item> items) {
        return items.stream().map(UpdatableItemFactory::basedOn).collect(toList());
    }
}
