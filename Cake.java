package domain;

public class Cake implements Item {
    private int weight;

    public Cake(int weight) {
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cake: " + weight;
    }

}
