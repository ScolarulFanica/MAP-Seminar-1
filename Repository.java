package repository;

import domain.Item;
import exception.RepositoryException;

public class Repository implements IRepository {

    private Item[] items;
    private int currentIndex;
    public final static int ARRAY_SIZE = 10;
    public Repository() {
        this.items = new Item[ARRAY_SIZE];
        this.currentIndex = 0;
    }

    @Override
    public void add(Item item) throws RepositoryException {
        if(currentIndex == ARRAY_SIZE) {
            throw new RepositoryException("Size limit exceed!");
        }
        this.items[this.currentIndex] = item;
        this.currentIndex++;
    }

    @Override
    public Item[] getAll() {
        return this.items;
    }
    public int getCurrentIndex() {
        return this.currentIndex;
    }
}
