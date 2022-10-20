package flower.store;
import lombok.Getter;
import lombok.Setter;

@Setter
public class FlowerPack {
    private Flower flower;
    @Getter
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        setFlower(flower);
        setQuantity(quantity);
    }


    public double getPrice() {
        return quantity * flower.getPrice();
    }
}
