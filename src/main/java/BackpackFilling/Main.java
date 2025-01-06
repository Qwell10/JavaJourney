package BackpackFilling;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FillWithHighestValueService service = new FillWithHighestValueService();

        Backpack backpack = new Backpack(10);
        List<Item> items = List.of(
                new Item(5, 10),
                new Item(6, 12),
                new Item(3, 8),
                new Item(4, 9),
                new Item(1, 3),
                new Item(2, 4));

        List<Item> thingsSorted = new ArrayList<>(items);
        thingsSorted.sort(Comparator.comparingDouble(item -> (double) item.weight() / item.value()));

        thingsSorted.forEach(item -> System.out.println("value:" + item.value() + " weight:" + item.weight()));

        List<Item> mostValuableItems = service.fillWithHighestValue(backpack, thingsSorted);

        mostValuableItems.forEach(item -> System.out.printf("value: %d, weight: %d ", item.value(), item.weight()));
    }
}