package flower.store;

import java.util.ArrayList;
import java.util.List;


public class FlowerBucket {
    private List<FlowerPack> flowers = new ArrayList<>();

    public void add(FlowerPack flower) {
        flowers.add(flower);
    }

    public int getPrice() {
        int price = 0;
        for (int i = 0; i < flowers.size(); i++) {
            price += flowers.get(i).getPrice();
        }
        return price;
    }
}
