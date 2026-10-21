class RegularDelivery extends Delivery {
    RegularDelivery(int distance, int weight) {
        super(distance, weight);
    }
    @Override
    public long calculateFee() {
        return 10 + (2L * distance) + weight;
    }
}
class ExpressDelivery extends Delivery {
    ExpressDelivery(int distance, int weight) {
        super(distance, weight);
    }
    @Override
    public long calculateFee() {
        return 25 + (4L * distance) + (2L * weight);
    }
}
