package BackpackFilling;

import java.util.ArrayList;
import java.util.List;

public class FillWithHighestValueService {

    public List<Item> fillWithHighestValue(Backpack backpack, List<Item> thingsSorted) {
        int remainingWeight = backpack.weightToCare();
        List<Item> mostValuableItems = new ArrayList<>();

        for (Item item : thingsSorted) {
            if (remainingWeight >= item.weight()) {
                mostValuableItems.add(item);
                remainingWeight -= item.weight();
            }

            if (remainingWeight < 0) {
                remainingWeight += item.weight();
                mostValuableItems.remove(mostValuableItems.size() - 1);
            }

        }
        return mostValuableItems;
    }
}
