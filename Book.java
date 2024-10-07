package domain;

public class Book implements Item {
    private int weight;

    public Book(int weight) {
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
        return "Book: " + weight;
    }

}
