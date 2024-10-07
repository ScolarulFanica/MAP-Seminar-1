package repository;

import domain.Item;
import exception.RepositoryException;

public interface IRepository {

    void add(Item item) throws RepositoryException;
    Item[] getAll();
    int getCurrentIndex();
}
