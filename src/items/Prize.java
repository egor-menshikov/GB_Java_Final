package items;

public class Prize implements Item<Prize> {
    private static int count = 1;
    private final int id;
    private final String name;
    private final int weightProbability;

    public Prize(String name, int weightProbability) {
        this.id = count;
        this.name = name;
        this.weightProbability = weightProbability;
        count++;
    }

    public int getWeightProbability() {
        return weightProbability;
    }

    @Override
    public String toString() {
        return "Prize: " +
                "id = " + id +
                ", name = " + name +
                ", weightProbability = " + weightProbability;
    }
}
