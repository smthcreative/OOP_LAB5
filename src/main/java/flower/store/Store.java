package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> buckets = new ArrayList<>();

    public void add(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public String search(FlowerBucket searchBucket) {
        for (FlowerBucket bucket
                :buckets) {
            if (bucket.equals(searchBucket)) {
                return "We have one";
            }
        }
        return "We haven`t";
    }

}
